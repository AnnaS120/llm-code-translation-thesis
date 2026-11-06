Here’s how you can translate the provided Python function into Java:

```java
public class Main {
    public static void main(String[] args) {
        // Loop iteration
        for (int i = 1; i < 10; i++) {
            // Loop iteration
            for (int j = 1; j < 10; j++) {
                int mul = i * j;
                // Print the formatted output
                System.out.println(i + "x" + j + "=" + mul);
            }
        }
    }
}
```

### Explanation:
1. **Class Declaration**: In Java, all code must be inside a class. Here, we define a class named `Main`.
2. **Main Method**: The `main` method is the entry point for Java applications, similar to the `if __name__ == '__main__':` check in Python.
3. **For Loops**: The for loops are similar in structure, but Java requires type declarations (e.g., `int`).
4. **String Formatting**: Instead of using `format`, we concatenate strings directly using the `+` operator in Java.
5. **Printing**: The `System.out.println` is used for printing output in Java.