Certainly! Below is the equivalent Java code for the provided Python function that prints a multiplication table:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) { // loop iteration
            for (int j = 0; j < 9; j++) { // loop iteration
                System.out.printf("%dx%d=%d%n", (i + 1), (j + 1), (i + 1) * (j + 1));
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates from 0 to 8, which corresponds to the first part of the multiplication (1 to 9).
- The inner loop also iterates from 0 to 8 for the second part of the multiplication.
- `System.out.printf` is used to format the output similarly to Python's `print` with `format`. The `%d` placeholders are used for integers, and `%n` is used for a new line.
- `(i + 1)` and `(j + 1)` are used to adjust the zero-based index to match the desired multiplication table (1 to 9).