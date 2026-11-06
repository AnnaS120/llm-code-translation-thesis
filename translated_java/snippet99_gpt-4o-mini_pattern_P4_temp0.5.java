Certainly! Below is the equivalent Java code for the given Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {  // loop iteration
            for (int j = 1; j < 10; j++) {  // loop iteration
                System.out.printf("%dx%d=%d%n", i, j, i * j);
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates over `i` from 1 to 9.
- The inner loop iterates over `j` from 1 to 9.
- `System.out.printf` is used for formatted output, similar to Python's `sys.stdout.write`. The `%n` is used for a newline character in Java.
- The `i * j` computes the product, just like in the original Python code.