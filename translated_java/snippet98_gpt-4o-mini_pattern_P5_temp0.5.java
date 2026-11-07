Here’s how you can translate the provided Python function into Java:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i);
                System.out.print("x");
                System.out.print(j);
                System.out.print("=");
                System.out.println(i * j);
            }
        }
    }
}
```

### Explanation:
1. **Class Definition**: In Java, the code needs to be inside a class. Here, it's named `Main`.
2. **Main Method**: This is the entry point of the Java application, similar to `if __name__ == "__main__":` in Python.
3. **Loops**: The `for` loops in Java are similar to those in Python, but they require type declarations (e.g., `int`).
4. **Printing**: In Java, `System.out.print()` is used for printing without a newline, and `System.out.println()` is used for printing with a newline.
5. **String Concatenation**: The `+` operator is used to concatenate strings in Java, which is implicitly handled in the `print` statements here.

You can compile and run this Java code to see the same multiplication table output as the Python version.