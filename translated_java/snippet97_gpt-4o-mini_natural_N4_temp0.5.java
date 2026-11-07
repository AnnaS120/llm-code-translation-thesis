Certainly! Below is the equivalent Java implementation of the provided Python snippet. This Java code maintains the same functionality and output format.

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1; // Initialize a to 1
        for (int j = 0; j < 9; j++) { // Loop from 0 to 8 (9 iterations)
            int b = 1; // Initialize b to 1
            for (int i = 0; i < 9; i++) { // Loop from 0 to 8 (9 iterations)
                System.out.println(a + "x" + b + "=" + (a * b)); // Print the multiplication result
                b = b + 1; // Increment b
            }
            a = a + 1; // Increment a
        }
    }
}
```

### Explanation:
- The outer loop iterates `j` from 0 to 8 (9 iterations), which corresponds to the values of `a`.
- The inner loop iterates `i` from 0 to 8 (9 iterations), which corresponds to the values of `b`.
- The `System.out.println` statement prints the multiplication in the format `a x b = a * b`.
- Both `a` and `b` are incremented in their respective loops, similar to the original Python code. 

To run this code, you can copy it into a Java file (e.g., `MultiplicationTable.java`), compile it, and run it using a Java environment.