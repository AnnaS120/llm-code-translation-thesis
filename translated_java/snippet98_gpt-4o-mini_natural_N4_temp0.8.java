Certainly! Below is the Java implementation of the provided Python snippet, which maintains the original behavior of printing the multiplication table from 1 to 9.

```java
public class MultiplicationTable {

    public static void main(String[] args) {
        main();
    }

    public static void main() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i); // Print i without a newline
                System.out.print("x"); // Print 'x' without a newline
                System.out.print(j); // Print j without a newline
                System.out.print("="); // Print '=' without a newline
                System.out.println(i * j); // Print the result and move to the next line
            }
        }
    }
}
```

### Explanation:
- The Java program defines a class `MultiplicationTable`.
- The `main` method serves as the entry point for the program, calling the custom `main` method to execute the logic.
- The nested loops iterate from 1 to 9 for both `i` and `j`.
- `System.out.print` is used to print values without a newline (similar to `print(..., end="")` in Python).
- Finally, `System.out.println` prints the product of `i` and `j`, which also moves to the next line. 

You can compile and run this Java program to see the multiplication table printed in the same format as the Python code.