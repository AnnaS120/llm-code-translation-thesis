Here’s the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int N1 = 9;
        int N2 = 1;
        int a = N2;

        for (int j = 0; j < N1; j++) {
            int b = N2;
            for (int i = 0; i < N1; i++) {
                System.out.println(a + "x" + b + "=" + (a * b));
                b = b + N2;
            }
            a = a + N2;
        }
    }
}
```

### Explanation:
- The outer loop iterates `N1` times, where `a` is incremented by `N2` in each iteration.
- The inner loop also iterates `N1` times, where `b` starts at `N2` and is incremented by `N2` in each iteration.
- The `System.out.println` method is used to print the formatted output similar to the `print` function in Python.