Here's the equivalent Java code that replicates the functionality of the provided Python code. This Java program uses appropriate data types and method structure to compile successfully:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1; // Initialize a to 1
        for (int j = 0; j < 9; j++) { // Outer loop for rows
            int b = 1; // Initialize b to 1 for each row
            for (int i = 0; i < 9; i++) { // Inner loop for columns
                System.out.println(a + " x " + b + " = " + (a * b)); // Print the multiplication statement
                b++; // Increment b
            }
            a++; // Increment a
        }
    }
}
```

### Explanation:
1. **Class Declaration**: The code is wrapped in a class named `MultiplicationTable`, which is a common practice in Java.
2. **Main Method**: The `main` method is the entry point of the program.
3. **Data Types**: The variables `a` and `b` are declared as `int`, which is appropriate for whole numbers.
4. **Loops**: The `for` loops are structured similarly to the Python version, iterating from 0 to 8 (9 iterations).
5. **Output**: The `System.out.println` method is used to print the output, formatted similarly to the Python `print` function.

This Java code will produce the same multiplication table output as the original Python code.