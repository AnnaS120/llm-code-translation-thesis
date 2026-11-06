Here’s how you can translate the given Python function into Java:

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
- **Class Declaration**: In Java, you typically encapsulate your code within a class.
- **Main Method**: The `main` method serves as the entry point for Java applications.
- **For Loops**: The structure of the loops remains similar, but you use `int` for variable declarations.
- **Output**: The `System.out.printf` method is used for formatted output, similar to Python's `sys.stdout.write` with formatting. The `%n` is used for a new line in Java.