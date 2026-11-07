Certainly! Below is the equivalent Java method that replicates the functionality of the provided Python function. The method prints the multiplication table for numbers 1 through 9.

```java
public class MultiplicationTable {

    public static void printMultiplicationTable() {
        int a = 1; // Starting number

        // Loop through numbers 1 to 9
        for (int j = 0; j < 9; j++) {
            int b = 1; // Multiplier

            // Loop through multipliers 1 to 9
            for (int i = 0; i < 9; i++) {
                // Print the multiplication statement
                System.out.println(a + " x " + b + " = " + (a * b));
                b++; // Increment the multiplier
            }
            a++; // Increment the number
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(); // Call the method to print the table
    }
}
```

### Explanation:
- The `printMultiplicationTable` method contains two nested loops: the outer loop iterates through numbers 1 to 9, while the inner loop iterates through multipliers from 1 to 9.
- It uses `System.out.println` to print the formatted multiplication statement.
- The `main` method calls `printMultiplicationTable` to execute the functionality.