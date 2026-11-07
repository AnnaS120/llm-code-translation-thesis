Here’s the equivalent Java code that compiles successfully and performs the same functionality as the provided Python code:

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
1. **Class Declaration**: In Java, all code must be inside a class. Here, we define a class named `MultiplicationTable`.
2. **Main Method**: The `main` method is the entry point of any Java application.
3. **Loops**: The nested `for` loops iterate from 1 to 9, similar to the Python code.
4. **Output**: The `System.out.printf` method is used to format the output, similar to Python's `sys.stdout.write` with string formatting. The `%n` is used for a new line in Java.

This code will print the multiplication table from 1 to 9, just like the original Python code.