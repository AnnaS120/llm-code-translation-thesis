import os
import re

# Directories
raw_dir = "translated_java"              # Raw translations from LLM
cleaned_dir = "translated_java_cleaned"  # Cleaned Java files
os.makedirs(cleaned_dir, exist_ok=True)

def clean_java_code(java_code):
    import re

    # Remove markdown/code block markers
    java_code = re.sub(r"```[a-z]*", "", java_code).strip()

    cleaned_lines = []
    for line in java_code.splitlines():
        stripped = line.strip()

        # Keep only lines that are likely valid Java code
        is_code_line = (
            re.match(
                r"^\s*(import|class|public|private|protected|static|final|int|float|double|String|System\.out|Collections|ArrayList|List|for|while|if|else|switch|case|return|try|catch|new)\b",
                stripped
            )
            or ";" in stripped
            or stripped.endswith(("}", "{"))
        )

        if is_code_line:
            # Fix incorrect imports like 'import_java'
            line = line.replace("import_java", "import java")
            line = re.sub(r"import\s+java\s+util", "import java.util", line)
            cleaned_lines.append(line)

    java_code = "\n".join(cleaned_lines).strip()

    # Ensure class name is 'Solution'
    if "class " not in java_code:
        indented_code = "\n".join("    " + l if l.strip() else "" for l in java_code.splitlines())
        java_code = f"class Solution {{\n{indented_code}\n}}"
    else:
        java_code = re.sub(r"public\s+class\s+\w+", "class Solution", java_code)
        java_code = re.sub(r"class\s+\w+", "class Solution", java_code, count=1)

    # Ensure a main() method exists
    if "static void main" not in java_code:
        main_method = (
            "    public static void main(String[] args) {\n"
            "        System.out.println(\"Solution compiled successfully.\");\n"
            "    }\n"
        )
        if java_code.endswith("}"):
            java_code = java_code[:-1] + "\n" + main_method + "}"
        else:
            java_code += "\n" + main_method

    return java_code.strip()



def main():
    java_files = [f for f in os.listdir(raw_dir) if f.endswith(".java")]
    java_files.sort()

    for java_file in java_files:
        raw_path = os.path.join(raw_dir, java_file)
        cleaned_path = os.path.join(cleaned_dir, java_file)

        with open(raw_path, "r", encoding="utf-8") as f:
            java_code = f.read()

        cleaned_code = clean_java_code(java_code)

        with open(cleaned_path, "w", encoding="utf-8") as f:
            f.write(cleaned_code)

        print(f"✔ Cleaned {java_file} → saved to {cleaned_path}")

    print("\nAll Java files have been cleaned and set to class 'Solution'.")

if __name__ == "__main__":
    main()
