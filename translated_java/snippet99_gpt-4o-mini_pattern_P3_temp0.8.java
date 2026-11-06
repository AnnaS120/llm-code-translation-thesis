Here’s the equivalent Java code for the provided Python function:

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

1. **Variable Declaration**: Java requires explicit type declarations for variables.
2. **Loop Structure**: The `for` loops are similar in structure to Python.
3. **Output**: In Java, `System.out.printf` is used for formatted printing, similar to Python's `sys.stdout.write` with string formatting.
4. **Replacing `\n`**: In `printf`, `%n` is used for a newline, which is platform-independent. 

You can run this Java function in any Java environment.