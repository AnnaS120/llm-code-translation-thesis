Here's the translation of the provided Python function into Java:

```java
public class Main {
    public static void main(String[] args) {
        // Loop iteration
        for (int i = 1; i < 10; i++) {
            // Loop iteration
            for (int j = 1; j < 10; j++) {
                System.out.print(i); // Print i
                System.out.print("x"); // Print "x"
                System.out.print(j); // Print j
                System.out.print("="); // Print "="
                System.out.println(i * j); // Print the product of i and j
            }
        }
    }
}
```

### Explanation:
- The `main` method serves as the entry point of the Java program.
- Two nested `for` loops are used to iterate through the numbers 1 to 9, similar to the Python `range(1, 10)`.
- `System.out.print` is used for printing without a newline, while `System.out.println` is used to print the result of the multiplication followed by a newline.
- The overall structure and functionality remain the same as in the Python version.