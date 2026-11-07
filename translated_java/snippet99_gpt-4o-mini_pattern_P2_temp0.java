Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int idx = 1; idx < 10; idx++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%dx%d=%d%n", idx, k, idx * k);
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates from 1 to 9 (inclusive).
- The inner loop also iterates from 1 to 9 (inclusive).
- `System.out.printf` is used to format the output similarly to Python's `sys.stdout.write` with string formatting.
- `%n` is used for a new line in Java, which is platform-independent.