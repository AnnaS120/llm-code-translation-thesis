Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { // loop iteration
            for (int j = 1; j < 10; j++) { // loop iteration
                System.out.printf("%dx%d=%d%n", i, j, i * j);
            }
        }
    }
}
```

### Explanation:
1. **Class Definition**: The Java code is wrapped in a public class named `MultiplicationTable`.
2. **Main Method**: The `main` method serves as the entry point for the program.
3. **For Loops**: The nested `for` loops iterate from 1 to 9, similar to the Python range.
4. **Output**: `System.out.printf` is used for formatted output, similar to Python's `sys.stdout.write` with string formatting. `"%n"` is used for a newline in Java.