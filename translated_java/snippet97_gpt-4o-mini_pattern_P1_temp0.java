Here’s how you can translate the given Python function into Java:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int x = 1;
        for (int j = 0; j < 9; j++) {
            int y = 1;
            for (int i = 0; i < 9; i++) {
                System.out.print(x + "x" + y + "=" + (x * y) + "\n");
                y = y + 1;
            }
            x = x + 1;
        }
    }
}
```

### Explanation:
1. **Variable Initialization**: The variables `x` and `y` are initialized similarly in both languages.
2. **Loops**: The `for` loops in Python are translated to Java's `for` loop syntax.
3. **Printing**: The `print` function in Python is replaced with `System.out.print` in Java. The `sep=''` in Python is handled by concatenating strings directly in Java.
4. **Newline**: The newline character `\n` is added to the `print` statement to ensure each output is on a new line.

This Java program will produce the same output as the original Python code.