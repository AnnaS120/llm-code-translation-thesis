Here's the equivalent Java code for the provided Python function:

```java
public class Main {
    static final int N1 = 10;
    static final int N2 = 1;

    public static void main(String[] args) {
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

- **Static variables**: In Java, I've declared `N1` and `N2` as static final variables to mimic the constants from Python.
- **Main method**: The `main` method serves as the entry point for the Java program.
- **For loops**: The loops iterate similarly to Python, but we use Java's syntax for `for`.
- **Print statements**: I used `System.out.print` for inline printing and `System.out.println` to print the product with a newline. 

You can compile and run this Java code to see the same output as your original Python function.