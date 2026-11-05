import csv
import os
from collections import defaultdict

DETAILED_RESULTS_FILE = "evaluation/detailed_results.csv"

def parse_results(file_path):
    """
    Parse detailed results and extract model, prompt, variation, and temperature details.
    """
    results = []
    with open(file_path, newline="", encoding="utf-8") as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            snippet_id = row["JavaSnippetID"]
            model, prompt_type, variation, temp = parse_metadata(snippet_id)
            results.append({
                "Model": model,
                "PromptType": prompt_type,
                "Variation": variation,
                "Temperature": temp,
                "CompilationStatus": row["CompilationStatus"],
                "RuntimeStatus": row["RuntimeStatus"],
                "OutputCorrectness": row["OutputCorrectness"]
            })
    return results

def parse_metadata(snippet_id):
    """
    Extract model, prompt type, variation (N1-N5, P1-P5), and temperature from snippet filename.
    Example snippet: snippet1_gpt-4o-mini_natural_N1_temp0.5
    """
    parts = snippet_id.split("_")
    model = next((p for p in parts if p.startswith("gpt-")), "unknown")
    prompt_type = "natural" if "natural" in parts else "pattern" if "pattern" in parts else "unknown"
    variation = next((p for p in parts if p.startswith("N") or p.startswith("P")), "unknown")
    temp = next((p.replace("temp", "") for p in parts if p.startswith("temp")), "unknown")
    return model, prompt_type, variation, temp

def calculate_grouped_rates(results):
    """
    Calculate compilation, runtime, and output correctness rates grouped by 
    (Model, PromptType, Variation, Temperature).
    """
    grouped = defaultdict(lambda: {"total": 0, "compilations": 0, "runtime_success": 0, "correct_outputs": 0})

    for r in results:
        key = (r["Model"], r["PromptType"], r["Variation"], r["Temperature"])
        grouped[key]["total"] += 1
        if r["CompilationStatus"] == "Success":
            grouped[key]["compilations"] += 1
        if r["RuntimeStatus"] == "Success":
            grouped[key]["runtime_success"] += 1
        if r["OutputCorrectness"] == "Correct":
            grouped[key]["correct_outputs"] += 1

    return grouped

def calculate_overall_rates(results):
    """
    Calculate overall compilation, runtime, and output correctness rates.
    """
    total = len(results)
    compilations = sum(1 for r in results if r["CompilationStatus"] == "Success")
    runtime_success = sum(1 for r in results if r["RuntimeStatus"] == "Success")
    correct_outputs = sum(1 for r in results if r["OutputCorrectness"] == "Correct")

    return {
        "total": total,
        "compilation_rate": compilations / total * 100 if total else 0,
        "runtime_rate": runtime_success / total * 100 if total else 0,
        "correctness_rate": correct_outputs / total * 100 if total else 0,
    }

def save_grouped_rates(grouped, overall, output_file="rates_calculation.csv"):
    """
    Save grouped and overall rates to a CSV file (now including Variation).
    """
    with open(output_file, mode="w", newline="", encoding="utf-8") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["Model", "PromptType", "Variation", "Temperature", 
                         "CompilationRate", "RuntimeRate", "OutputCorrectnessRate"])

        for (model, prompt_type, variation, temp), data in grouped.items():
            total = data["total"]
            comp_rate = data["compilations"] / total * 100 if total else 0
            runtime_rate = data["runtime_success"] / total * 100 if total else 0
            correctness_rate = data["correct_outputs"] / total * 100 if total else 0
            writer.writerow([model, prompt_type, variation, temp, 
                             f"{comp_rate:.2f}%", f"{runtime_rate:.2f}%", f"{correctness_rate:.2f}%"])

        # Add overall summary
        writer.writerow([])
        writer.writerow(["OVERALL SUMMARY"])
        writer.writerow(["Total Translations", "CompilationRate", "RuntimeRate", "OutputCorrectnessRate"])
        writer.writerow([
            overall["total"],
            f"{overall['compilation_rate']:.2f}%",
            f"{overall['runtime_rate']:.2f}%",
            f"{overall['correctness_rate']:.2f}%"
        ])

    print(f"Grouped and overall rates saved to {output_file}")

def main():
    results = parse_results(DETAILED_RESULTS_FILE)
    grouped = calculate_grouped_rates(results)
    overall = calculate_overall_rates(results)
    save_grouped_rates(grouped, overall)

if __name__ == "__main__":
    main()
