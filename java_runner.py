import os
import csv
import subprocess

java_dir = "translated_java_cleaned"
output_csv = "java_outputs.csv"

def run_java(java_file):
    """
    Runs a Java snippet (directly using `java`) and captures its output.
    Returns None if there is a runtime error.
    """
    try:
        result = subprocess.run(
            ["java", java_file],
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True,
            timeout=5
        )
        return result.stdout.strip() if result.returncode == 0 else None
    except subprocess.TimeoutExpired:
        return None

def main():
    java_files = [f for f in os.listdir(java_dir) if f.endswith(".java")]
    java_files.sort()

    with open(output_csv, mode="w", newline="", encoding="utf-8") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["SnippetID", "JavaOutput"])

        for java_file in java_files:
            snippet_id = os.path.splitext(java_file)[0]
            java_path = os.path.join(java_dir, java_file)

            output = run_java(java_path)
            if output is None:
                print(f"✘ Java runtime error: {java_file}")
                writer.writerow([snippet_id, "Runtime Error"])
            else:
                print(f"✔ Java executed: {java_file}")
                writer.writerow([snippet_id, output.replace("\n", "\\n")])

    print(f"\nJava outputs saved to {output_csv}")

if __name__ == "__main__":
    main()
