Here's the equivalent Java code for the provided Python function:

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
- The `main` method serves as the entry point in Java, similar to `if __name__ == "__main__":` in Python.
- The nested loops iterate from 1 to 9, just like in Python.
- `System.out.print` is used for printing without a newline, and `System.out.println` for printing with a newline after the value (i.e., `i * j`).
- The string concatenation is done using `System.out.print` for each component of the output.