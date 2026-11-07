Here’s the equivalent Java code for the provided Python function:

```java
public class Main {
    public static void main(String[] args) {
        for (int idx = 1; idx < 10; idx++) {
            for (int k = 1; k < 10; k++) {
                System.out.print(idx);
                System.out.print("x");
                System.out.print(k);
                System.out.print("=");
                System.out.println(idx * k);
            }
        }
    }
}
```

### Explanation:
- The `main` method serves as the entry point for the Java program, similar to the `if __name__ == "__main__":` block in Python.
- The nested loops iterate from 1 to 9, just like in the Python version.
- `System.out.print` is used to print without a newline, while `System.out.println` is used to print with a newline at the end.