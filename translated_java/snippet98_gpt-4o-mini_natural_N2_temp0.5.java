Here's the equivalent Java code for the provided Python code:

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
- The `main` method in Java serves a similar purpose to the `main` function in Python.
- The `for` loops iterate over the range from 1 to 9, just like in Python.
- `System.out.print` is used to print without a newline, similar to `print(..., end="")` in Python.
- `System.out.println` is used to print with a newline, similar to `print(...)` in Python.