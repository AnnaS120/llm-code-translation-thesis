import os
import csv
import subprocess

python_dir = "python_dataset_ready"
output_csv = "python_outputs.csv"

def run_python(python_file):
    """
    Runs a Python snippet and captures its output.
    """
    try:
        result = subprocess.run(
            ["python3", python_file],
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True,
            timeout=5
        )
        return result.stdout.strip() if result.returncode == 0 else None
    except subprocess.TimeoutExpired:
        return None

def main():
    python_files = [f for f in os.listdir(python_dir) if f.endswith(".py")]
    python_files.sort()

    with open(output_csv, mode="w", newline="", encoding="utf-8") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["SnippetID", "PythonOutput"])

        for py_file in python_files:
            snippet_id = os.path.splitext(py_file)[0]
            py_path = os.path.join(python_dir, py_file)

            output = run_python(py_path)
            if output is None:
                print(f"✘ Python runtime error: {py_file}")
                writer.writerow([snippet_id, "Runtime Error"])
            else:
                print(f"✔ Python executed: {py_file}")
                writer.writerow([snippet_id, output.replace("\n", "\\n")])

    print(f"\nPython outputs saved to {output_csv}")

if __name__ == "__main__":
    main()
