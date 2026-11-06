Here’s the equivalent Java code for the provided Python code:

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
- The outer loop iterates from 1 to 9 (inclusive of 1, exclusive of 10), similar to the Python `range(1, 10)`.
- The inner loop does the same.
- `System.out.printf` is used in Java to format the string output, similar to Python's `sys.stdout.write` with string formatting. The `%n` is used for a newline in Java.