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
- The outer loop iterates from 1 to 9 (inclusive).
- The inner loop also iterates from 1 to 9 (inclusive).
- The `System.out.printf` method is used to format the output, similar to Python's `sys.stdout.write` with string formatting.
- `%n` is used for a new line in Java, which is platform-independent.