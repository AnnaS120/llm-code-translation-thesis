Certainly! Below is a valid Java implementation of the provided Python snippet. The Java code uses nested loops to replicate the behavior of the Python code, printing the multiplication table from 1 to 9.

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
- The `System.out.printf` method is used to format the output, similar to how `sys.stdout.write` works in Python.
- `%d` is used as a placeholder for integers, and `%n` is used to insert a newline character. 

You can run this Java code in any Java environment, and it will produce the same output as the original Python snippet.