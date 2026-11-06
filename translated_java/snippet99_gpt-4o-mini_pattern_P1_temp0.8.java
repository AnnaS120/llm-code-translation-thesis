Here’s how you can translate the provided Python function into Java:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\n");
            }
        }
    }
}
```

### Explanation:

1. **Class Declaration**: In Java, you need to declare a class, here it's `MultiplicationTable`.

2. **Main Method**: The `main` method is the entry point for Java applications. 

3. **Loops**: The `for` loops in Java have a similar structure to Python, but you need to declare the variable type (e.g., `int`).

4. **Printing**: Instead of `sys.stdout.write`, Java uses `System.out.print` for output. The `+` operator is used for string concatenation.

5. **Newline**: `\n` is used to create a new line in the output.

This Java program will produce the same multiplication table output as the original Python code.