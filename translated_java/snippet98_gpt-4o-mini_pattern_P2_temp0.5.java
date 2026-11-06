Here's the equivalent Java code for the provided Python function:

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
- The `main` method serves as the entry point of the Java program.
- Two nested loops iterate from 1 to 9, similar to the Python `range(1, 10)`.
- The `System.out.print` method is used to print without a newline, and `System.out.println` is used to print with a newline.
- The multiplication result is calculated and printed in the same manner as in the Python version.