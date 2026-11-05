Certainly! Below is the Java implementation that preserves the behavior of the provided Python snippet. This Java program will generate multiplication tables for numbers 1 through 9, formatted similarly to the output of the original Python code.

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                String message = i + "x" + j + "=" + (i * j);
                System.out.println(message);
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates through numbers 1 to 9 (inclusive).
- The inner loop also iterates through numbers 1 to 9 (inclusive).
- Each multiplication result is formatted into a string in the format "IxJ=Result" and printed to the console, just like in the Python code.

### How to Run:
1. Save the code in a file named `MultiplicationTable.java`.
2. Compile it using the command: `javac MultiplicationTable.java`.
3. Run it with the command: `java MultiplicationTable`.

This will yield the same multiplication table output as the original Python code.