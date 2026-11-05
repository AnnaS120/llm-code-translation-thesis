import os
import re
import random
import shutil

SNIPPETS_DIR = "python_dataset_original"
MODIFIED_DIR = "python_dataset_ready"

def generate_test_data(n=10, min_val=1, max_val=100):
    """Generate a list of random test values."""
    return [random.randint(min_val, max_val) for _ in range(n)]

def find_list_variable_name(code):
    """
    Detects the list variable used for storing inputs.
    Looks for patterns like: var = [] or var.append(...)
    """
    match = re.search(r'(\w+)\s*=\s*\[\s*\]', code)
    if match:
        return match.group(1)

    match = re.search(r'(\w+)\.append', code)
    if match:
        return match.group(1)

    return "data"

def clean_indentation(code):
    """
    Attempt to fix common indentation issues by removing
    unnecessary leading spaces and fixing misaligned blocks.
    """
    lines = code.split('\n')
    cleaned_lines = []
    for line in lines:
        line = line.rstrip()
        line = line.replace('\t', '    ')
        cleaned_lines.append(line)
    return '\n'.join(cleaned_lines)

def remove_duplicate_initializations(code, var_name):
    """
    Remove redundant variable initializations like var = []
    if we already insert test data for that variable.
    """
    return re.sub(rf'(?m)^\s*{var_name}\s*=\s*\[.*?\]\s*$', '', code)

def process_snippet(input_path, output_path):
    with open(input_path, 'r', encoding='utf-8') as f:
        code = f.read()

    modified = False
    var_name = find_list_variable_name(code)

    # --- Log eval() presence ---
    if "eval(" in code:
        print(f"[WARN] 'eval()' found in {os.path.basename(input_path)} (kept as is).")

    # --- Handle input() based snippets ---
    if "input()" in code:
        n = 10
        match = re.search(r'for\s+\w+\s+in\s+range\((\w+)\)', code)
        if match:
            count = match.group(1)
            value_match = re.search(rf'{count}\s*=\s*(\d+)', code)
            if value_match:
                n = int(value_match.group(1))

        test_values = generate_test_data(n)
        code = remove_duplicate_initializations(code, var_name)
        code = f"{var_name} = {test_values}\n" + re.sub(r'input\(\)', f'{var_name}.pop(0)', code)
        modified = True
        print(f"[INFO] Replaced input() in {os.path.basename(input_path)} with test values.")

    # --- Handle sys.stdin based snippets ---
    elif "sys.stdin" in code:
        test_values = generate_test_data(10)
        test_list = ", ".join(map(str, test_values))
        code = re.sub(r'(?m)^import\s+sys\s*\n?', '', code)
        code = remove_duplicate_initializations(code, var_name)

        # Replace sys.stdin.readlines()
        code, count_readlines = re.subn(r'sys\.stdin\.readlines\(\)', f"[{test_list}]", code)
        if count_readlines > 0:
            print(f"[INFO] Replaced sys.stdin.readlines() in {os.path.basename(input_path)}")

        # Replace sys.stdin.read().split()
        code, count_read_split = re.subn(
            r'\[?int\(i\)\s*for\s*i\s*in\s*sys\.stdin\.read\(\)\.split\(\)\]?',
            str(test_values),
            code
        )
        if count_read_split > 0:
            modified = True
            print(f"[INFO] Replaced sys.stdin.read().split() in {os.path.basename(input_path)}")

        # Remove stdin loops
        code = re.sub(
            r'(?m)^\s*for\s+\w+\s+in\s+sys\.stdin:\s*\n(?:\s+.*\n)*',
            '',
            code
        )
        if count_readlines == 0 and count_read_split == 0:
            code = f"{var_name} = [{test_list}]\n" + code

        modified = True
        print(f"[INFO] Handled sys.stdin in {os.path.basename(input_path)} with test values.")

    # --- Handle 'from sys import stdin' based snippets ---
    elif re.search(r'from\s+sys\s+import\s+stdin', code):
        test_values = generate_test_data(10)
        test_list = ", ".join(map(str, test_values))
        code = re.sub(r'(?m)^from\s+sys\s+import\s+stdin\s*\n?', '', code)
        code = remove_duplicate_initializations(code, var_name)

        # Replace list comprehensions like [int(l) for l in stdin]
        code, count_stdin_for = re.subn(
            r'\[\s*int\(l\)\s*for\s+l\s+in\s+stdin\s*\]',
            str(test_values),
            code
        )
        if count_stdin_for > 0:
            modified = True
            print(f"[INFO] Replaced '[int(l) for l in stdin]' in {os.path.basename(input_path)}")

        # Remove for loops directly iterating over stdin
        code = re.sub(
            r'(?m)^\s*for\s+\w+\s+in\s+stdin:\s*\n(?:\s+.*\n)*',
            '',
            code
        )

        # Add test data if nothing replaced
        if count_stdin_for == 0:
            code = f"{var_name} = [{test_list}]\n" + code
            modified = True

        print(f"[INFO] Handled 'from sys import stdin' in {os.path.basename(input_path)} with test values.")

    # --- Final cleanup for indentation ---
    code = clean_indentation(code)
    with open(output_path, 'w', encoding='utf-8') as f:
        f.write(code)

    if modified:
        print(f"[DONE] Modified {os.path.basename(input_path)} and saved to {output_path}")
    else:
        print(f"[SKIP] {os.path.basename(input_path)} (no interactive input found).")

def process_all_snippets():
    if not os.path.exists(MODIFIED_DIR):
        os.makedirs(MODIFIED_DIR)

    for root, _, files in os.walk(SNIPPETS_DIR):
        for file in files:
            if file.endswith(".py"):
                input_path = os.path.join(root, file)
                output_path = os.path.join(MODIFIED_DIR, file)

                # Skip if already exists
                if os.path.exists(output_path):
                    print(f"[SKIP] {file} already exists in {MODIFIED_DIR}.")
                    continue

                process_snippet(input_path, output_path)

if __name__ == "__main__":
    process_all_snippets()



