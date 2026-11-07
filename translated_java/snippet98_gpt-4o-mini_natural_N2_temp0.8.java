Here’s the equivalent Java code for the provided Python function:

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
- The `main` method serves as the entry point of the Java application, similar to the `if __name__ == "__main__":` block in Python.
- Two nested `for` loops iterate from 1 to 9, just like in the Python code.
- The `System.out.print()` method is used to print without a newline, while `System.out.println()` is used to print with a newline at the end, which corresponds to the structure of the Python `print` functions.