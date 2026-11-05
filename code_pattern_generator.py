import os
import re

# Input and output directories
input_dir = "python_dataset_ready"
output_dir = "pattern_variations"
os.makedirs(output_dir, exist_ok=True)

def rename_variables(code, replacements):
    """Rename variables in the code according to a replacement dictionary."""
    for old, new in replacements.items():
        code = re.sub(rf'\b{old}\b', new, code)
    return code

def replace_numbers_with_constants(code):
    """Replace numbers with constants (e.g., 5 -> N = 5)."""
    matches = re.findall(r'\b\d+\b', code)
    numbers = sorted(set(matches), key=lambda x: len(x), reverse=True)
    constants = []
    for i, num in enumerate(numbers, start=1):
        const_name = f"N{i}"
        constants.append(f"{const_name} = {num}")
        code = re.sub(rf'\b{num}\b', const_name, code)
    if constants:
        code = "\n".join(constants) + "\n" + code
    return code

def add_inline_comments(code):
    """Add inline comments to certain lines."""
    lines = code.splitlines()
    modified = []
    for line in lines:
        if line.strip().startswith("for "):
            modified.append(line + "  # loop iteration")
        elif line.strip().startswith("if "):
            modified.append(line + "  # condition check")
        else:
            modified.append(line)
    return "\n".join(modified)

def add_redundant_parentheses(code):
    """Add redundant parentheses in conditions and arithmetic operations."""
    code = re.sub(r'(\w+)\s*==\s*(\w+)', r'(\1) == (\2)', code)
    code = re.sub(r'(\w+)\s*\+\s*(\w+)', r'(\1) + (\2)', code)
    code = re.sub(r'(\w+)\s*-\s*(\w+)', r'(\1) - (\2)', code)
    return code

def generate_pattern_variations(code):
    """
    Generate 5 pattern variations (P1–P5) of the Python code.
    """
    variations = {}

    # P1: Rename common variable names (a -> x, b -> y)
    P1 = rename_variables(code, {"a": "x", "b": "y", "n": "count"})
    variations["P1"] = P1

    # P2: Rename loop variables (i -> idx, j -> k)
    P2 = rename_variables(code, {"i": "idx", "j": "k"})
    variations["P2"] = P2

    # P3: Replace numbers with constants
    P3 = replace_numbers_with_constants(code)
    variations["P3"] = P3

    # P4: Add inline comments
    P4 = add_inline_comments(code)
    variations["P4"] = P4

    # P5: Add redundant parentheses
    P5 = add_redundant_parentheses(code)
    variations["P5"] = P5

    return variations

def main():
    python_files = [f for f in os.listdir(input_dir) if f.endswith(".py")]
    python_files.sort()

    for filename in python_files:
        base_name = filename[:-3]
        with open(os.path.join(input_dir, filename), "r", encoding="utf-8") as f:
            original_code = f.read()

        variations = generate_pattern_variations(original_code)

        for variation_name, code_variant in variations.items():
            variation_file = f"{base_name}_{variation_name}.py"
            with open(os.path.join(output_dir, variation_file), "w", encoding="utf-8") as out:
                out.write(code_variant)

        print(f"✔ Generated pattern variations for {filename}")

if __name__ == "__main__":
    main()
