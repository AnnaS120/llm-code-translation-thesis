Here is the equivalent Java code for the provided Python function:

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
- The `System.out.printf` method is used to format the output similarly to Python's `sys.stdout.write` and string formatting. The `%n` is used for a newline character in Java.