Here’s the equivalent Java method that replicates the functionality of the provided Python function:

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
- The `printMultiplicationTable` method contains two nested loops that iterate from 1 to 9, similar to the Python `range(1, 10)`.
- The `System.out.printf` method is used to format the output, similar to Python's `sys.stdout.write` with string formatting.
- The `%n` in the format string is used for a new line, which is platform-independent.