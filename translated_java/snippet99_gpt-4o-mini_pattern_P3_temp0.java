Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;

        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
                System.out.printf("%dx%d=%d%n", i, j, i * j);
            }
        }
    }
}
```

### Explanation:
- The `for` loops in Java are similar to those in Python.
- `System.out.printf` is used to format the output, similar to `sys.stdout.write` in Python.
- `%n` is used in Java for a new line, which is platform-independent.