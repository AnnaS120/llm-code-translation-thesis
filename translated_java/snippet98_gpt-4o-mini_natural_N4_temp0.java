Here’s a valid Java implementation of the provided Python snippet. The Java code preserves the original behavior of printing the multiplication table from 1 to 9.

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
- The `main` method serves as the entry point of the program.
- Two nested `for` loops iterate over the range from 1 to 9 (inclusive).
- The `System.out.print` method is used to print without a newline, similar to Python's `print(..., end="")`.
- The `System.out.println` method is used to print the result of the multiplication followed by a newline, similar to the final `print` in the Python snippet.