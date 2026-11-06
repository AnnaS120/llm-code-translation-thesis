Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        for (int idx = 1; idx < 10; idx++) {
            for (int k = 1; k < 10; k++) {
                System.out.println(idx + "x" + k + "=" + (idx * k));
            }
        }
    }
}
```

### Explanation:
- The `solve` method contains two nested loops, similar to the Python version, iterating from 1 to 9.
- The `System.out.println` method is used to print the formatted string, which combines the multiplication operation and its result.
- The `main` method serves as the entry point for the Java program, calling the `solve` method.