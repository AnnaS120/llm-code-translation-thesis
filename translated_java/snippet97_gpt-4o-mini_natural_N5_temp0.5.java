Here's the equivalent Java code that replicates the functionality of the provided Python code. It uses appropriate data types and follows Java's method structure:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1; // Initialize a
        
        // Outer loop for a from 1 to 9
        for (int j = 0; j < 9; j++) {
            int b = 1; // Initialize b
            
            // Inner loop for b from 1 to 9
            for (int i = 0; i < 9; i++) {
                // Print the multiplication result in the format a x b = a*b
                System.out.println(a + " x " + b + " = " + (a * b));
                b++; // Increment b
            }
            a++; // Increment a
        }
    }
}
```

### Explanation:
- The outer loop iterates `j` from 0 to 8 (which corresponds to 1 to 9 in terms of `a`).
- The inner loop iterates `i` from 0 to 8 (which corresponds to 1 to 9 in terms of `b`).
- The `System.out.println` method is used to print the formatted output, similar to Python's `print` function.
- The variables `a` and `b` are declared as integers, and their values are incremented appropriately in each loop.