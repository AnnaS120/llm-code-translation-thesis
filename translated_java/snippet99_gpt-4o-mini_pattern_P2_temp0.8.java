Certainly! Below is the translation of the given Python function into Java:

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
- The outer loop (`for (int idx = 1; idx < 10; idx++)`) iterates from 1 to 9 (inclusive).
- The inner loop (`for (int k = 1; k < 10; k++)`) does the same.
- `System.out.printf` is used to format the output in a way similar to Python's `sys.stdout.write` with string formatting. `%n` is used for a newline in Java.
- The multiplication result (`idx * k`) is calculated in the same way as in the Python code.