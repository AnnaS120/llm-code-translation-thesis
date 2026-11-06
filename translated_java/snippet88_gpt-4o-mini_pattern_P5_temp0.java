Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        // Loop through numbers 1 to 9 for the multiplication table
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                // Print the multiplication result in the format "i x j = result"
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates through numbers 1 to 9 (inclusive).
- The inner loop also iterates through numbers 1 to 9.
- The `System.out.println` method is used to print the formatted string, similar to Python's `print` function with string formatting.