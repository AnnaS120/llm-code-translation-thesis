Here is the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
- The `solve` method contains two nested loops that iterate from 1 to 9, similar to the Python version.
- The `System.out.println` method is used to print the formatted string, similar to Python's `print` function.
- The `main` method is the entry point of the Java application, which calls the `solve` method.