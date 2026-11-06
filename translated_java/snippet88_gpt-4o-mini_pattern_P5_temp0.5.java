Here’s the equivalent Java code for the provided Python function that prints the multiplication table from 1 to 9:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        // Loop through numbers 1 to 9
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                // Print the multiplication result
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
1. **Class Declaration**: In Java, all code must be inside a class.
2. **Main Method**: The entry point of the program is the `main` method.
3. **Loops**: The nested loops iterate through numbers 1 to 9, similar to the Python version.
4. **Output**: The `System.out.println` method is used to print the formatted string, similar to Python's `print` function.