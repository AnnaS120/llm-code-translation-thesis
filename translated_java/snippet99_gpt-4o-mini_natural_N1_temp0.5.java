Sure! Below is the equivalent Java code that replicates the functionality of the provided Python function:

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
- The outer loop iterates over `i` from 1 to 9.
- The inner loop iterates over `j` from 1 to 9.
- Inside the inner loop, `System.out.printf` is used to format the output, similar to Python's `sys.stdout.write` with the format string. The `%n` is used for a new line in Java, similar to `\n` in Python.