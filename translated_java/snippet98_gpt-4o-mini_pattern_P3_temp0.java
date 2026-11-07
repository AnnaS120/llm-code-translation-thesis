Here’s the equivalent Java code for the provided Python function:

```java
public class Main {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;

        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
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
- The `for` loops iterate from `N2` to `N1`, just like in Python.
- `System.out.print` is used to print without a newline, while `System.out.println` is used to print with a newline.
- The multiplication and formatting are done in the same way as in the Python code.