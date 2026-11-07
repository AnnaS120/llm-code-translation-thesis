Sure! Below is the equivalent Java code for the provided Python function:

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
- The `main` method in Java serves a similar purpose to the `main()` function in Python.
- The `for` loops iterate from 1 to 9 (inclusive of 1, exclusive of 10).
- The `System.out.print()` method is used to print outputs without a newline, while `System.out.println()` is used to print outputs with a newline.
- The multiplication and formatting are done in the same way as in the Python version.