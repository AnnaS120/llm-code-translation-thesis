import os
import csv
from dotenv import load_dotenv
from openai import OpenAI

# Load API key
load_dotenv()
client = OpenAI(api_key=os.getenv("OPENAI_API_KEY"))

# Directories
input_dir = "python_dataset_ready"
pattern_dir = "pattern_variations"
output_dir = "translated_java"
os.makedirs(output_dir, exist_ok=True)

# Models and Temperatures
models = ["gpt-3.5-turbo", "gpt-4o-mini"]
temperatures = [0, 0.5, 0.8]

# Natural prompt variations (N1–N5)
natural_prompts = {
    "N1": lambda code: f"Translate the following Python function into Java:\n\n{code}",
    "N2": lambda code: f"Convert the Python code below into equivalent Java code. Ensure the logic and structure are correct:\n\n{code}",
    "N3": lambda code: f"Rewrite the provided Python function as a Java method, following correct Java syntax and conventions:\n\n{code}",
    "N4": lambda code: f"Produce a valid Java implementation of the following Python snippet. Preserve the original behavior:\n\n{code}",
    "N5": lambda code: f"Turn the Python code to Java code that compiles successfully, using appropriate data types and method structure:\n\n{code}"
}

# Pattern prompt for all pattern variations
pattern_prompt = lambda code: f"Translate the following Python function into Java:\n\n{code}"

def load_completed_translations(log_path):
    """Load completed translations from CSV log."""
    completed = set()
    if os.path.exists(log_path):
        with open(log_path, newline="", encoding="utf-8") as csvfile:
            reader = csv.DictReader(csvfile)
            for row in reader:
                completed.add(row["OutputFile"])
    return completed

def translate_code(python_code, prompt_func, temperature, model):
    """Send a prompt to the LLM and return the translated Java code."""
    prompt = prompt_func(python_code)
    response = client.responses.create(
        model=model,
        input=prompt,
        temperature=temperature
    )
    return response.output_text.strip()

def main():
    python_files = [f for f in os.listdir(input_dir) if f.endswith(".py")]
    python_files.sort()

    log_file = os.path.join(output_dir, "translations_log.csv")
    completed = load_completed_translations(log_file)

    # Create log file if it doesn't exist
    log_exists = os.path.exists(log_file)
    with open(log_file, mode="a", newline="", encoding="utf-8") as log_csv:
        writer = csv.writer(log_csv)
        if not log_exists:
            writer.writerow(["Snippet", "Model", "PromptType", "Variation", "Temperature", "OutputFile", "Status"])

        for filename in python_files:
            base_name = filename[:-3]
            snippet_path = os.path.join(input_dir, filename)
            with open(snippet_path, "r", encoding="utf-8") as f:
                original_code = f.read()

            # Natural prompts (N1–N5)
            for model in models:
                for temp in temperatures:
                    for variation, prompt_func in natural_prompts.items():
                        output_file = f"{base_name}_{model}_natural_{variation}_temp{temp}.java"
                        if output_file in completed:
                            continue
                        try:
                            java_code = translate_code(original_code, prompt_func, temp, model)
                            with open(os.path.join(output_dir, output_file), "w", encoding="utf-8") as out:
                                out.write(java_code)
                            print(f"✔ {filename} → {output_file} ({model}, natural-{variation}, temp={temp})")
                            writer.writerow([filename, model, "natural", variation, temp, output_file, "Success"])
                        except Exception as e:
                            print(f"✘ Error: {filename} with natural-{variation} ({model}, temp={temp}) - {e}")
                            writer.writerow([filename, model, "natural", variation, temp, output_file, f"Error: {e}"])

            # Pattern variations (P1–P5)
            for pattern_index in range(1, 6):
                pattern_file = os.path.join(pattern_dir, f"{base_name}_P{pattern_index}.py")
                if not os.path.exists(pattern_file):
                    continue
                with open(pattern_file, "r", encoding="utf-8") as pf:
                    pattern_code = pf.read()

                for model in models:
                    for temp in temperatures:
                        variation = f"P{pattern_index}"
                        output_file = f"{base_name}_{model}_pattern_{variation}_temp{temp}.java"
                        if output_file in completed:
                            continue
                        try:
                            java_code = translate_code(pattern_code, pattern_prompt, temp, model)
                            with open(os.path.join(output_dir, output_file), "w", encoding="utf-8") as out:
                                out.write(java_code)
                            print(f"✔ {filename} → {output_file} ({model}, pattern-{variation}, temp={temp})")
                            writer.writerow([filename, model, "pattern", variation, temp, output_file, "Success"])
                        except Exception as e:
                            print(f"✘ Error: {filename} with pattern-{variation} ({model}, temp={temp}) - {e}")
                            writer.writerow([filename, model, "pattern", variation, temp, output_file, f"Error: {e}"])

if __name__ == "__main__":
    main()
