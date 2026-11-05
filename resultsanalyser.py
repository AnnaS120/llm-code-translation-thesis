import csv
import os

PYTHON_OUTPUTS_FILE = "evaluation/python_outputs.csv"
JAVA_OUTPUTS_FILE = "evaluation/java_outputs.csv"
DETAILED_LOG_FILE = "evaluation/detailed_results.csv"


def load_outputs(file_path, column_name):
    """
    Loads outputs from a CSV file into a dictionary.
    """
    outputs = {}
    with open(file_path, newline='', encoding='utf-8') as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            outputs[row["SnippetID"].strip()] = row[column_name].strip()
    return outputs


def analyse_outputs(python_outputs, java_outputs):
    """
    Generates detailed comparison for each Java snippet.
    """
    results = []
    for java_snippet, java_output in java_outputs.items():
        base_snippet = java_snippet.split("_")[0]  # e.g., snippet1
        python_output = python_outputs.get(base_snippet, "")

        compilation_status = "Success"
        runtime_status = "Success"
        correctness = "Mismatch"

        if java_output == "Compilation Error":
            compilation_status = "Compilation Error"
            runtime_status = "-"
            correctness = "-"
        elif java_output == "Runtime Error":
            runtime_status = "Runtime Error"
            correctness = "-"
        else:
            correctness = "Correct" if java_output == python_output else "Mismatch"

        results.append([
            java_snippet,
            compilation_status,
            runtime_status,
            correctness,
            python_output,
            java_output
        ])

    return results


def save_detailed_results(results):
    """
    Save per-snippet analysis to CSV.
    """
    with open(DETAILED_LOG_FILE, mode="w", newline="", encoding="utf-8") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow([
            "JavaSnippetID", "CompilationStatus", "RuntimeStatus",
            "OutputCorrectness", "ExpectedPythonOutput", "JavaOutput"
        ])
        writer.writerows(results)
    print(f"\nDetailed results saved to {DETAILED_LOG_FILE}")


def main():
    python_outputs = load_outputs(PYTHON_OUTPUTS_FILE, "PythonOutput")
    java_outputs = load_outputs(JAVA_OUTPUTS_FILE, "JavaOutput")

    results = analyse_outputs(python_outputs, java_outputs)
    save_detailed_results(results)


if __name__ == "__main__":
    main()
