Here's the equivalent Java code that compiles successfully and mirrors the functionality of the given Python code:

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
- The `main` method serves as the entry point, similar to the Python `if __name__ == "__main__":` block.
- We use `for` loops to iterate through the numbers 1 to 9, akin to `range(1, 10)` in Python.
- The `System.out.print` method is used to print without a newline (like `print(..., end="")` in Python), and `System.out.println` is used to print with a newline.
- The multiplication and concatenation of strings are done similarly, ensuring the output format matches the original Python code.