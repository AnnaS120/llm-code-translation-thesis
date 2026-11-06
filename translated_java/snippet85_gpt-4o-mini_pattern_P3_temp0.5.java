Here's the translation of the provided Python function into Java:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;
        solve(N1, N2);
    }

    public static void solve(int N1, int N2) {
        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
- The `solve` method is defined to take `N1` and `N2` as parameters.
- Two nested loops iterate from `N2` to `N1`, similar to the Python version.
- The `System.out.println` method is used to print the multiplication results, formatted similarly to the Python `print` function.