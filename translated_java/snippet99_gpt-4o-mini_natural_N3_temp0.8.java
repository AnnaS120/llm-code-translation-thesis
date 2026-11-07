Certainly! Here’s the provided Python function rewritten as a Java method, following correct Java syntax and conventions:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%dx%d=%d%n", i, j, i * j);
            }
        }
    }
}
```

### Explanation:
- The method `printMultiplicationTable` generates a multiplication table from 1 to 9.
- `System.out.printf` is used for formatted output, similar to `sys.stdout.write` in Python.
- The `%n` format specifier is used to insert a new line correctly across different platforms (Windows, Linux, etc.).