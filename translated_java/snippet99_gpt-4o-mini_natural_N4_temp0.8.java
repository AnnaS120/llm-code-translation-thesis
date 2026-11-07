Here's a valid Java implementation of the provided Python snippet, maintaining the original behavior:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%dx%d=%d%n", i, j, i * j);
            }
        }
    }
}
```

### Explanation:

1. **Class Declaration**: In Java, we define a class (here named `MultiplicationTable`) which contains the `main` method.

2. **`main` Method**: This is the entry point for any Java application.

3. **Loops**: We use nested `for` loops to iterate from 1 to 9, similar to the Python version.

4. **Output**: The `System.out.printf` method is utilized to format the output in a way that mimics Python's `sys.stdout.write` with formatted strings. The `%n` is used to ensure a new line is printed after each output.

This Java code will produce the same output as the Python snippet, displaying the multiplication table from 1 to 9 for both dimensions.