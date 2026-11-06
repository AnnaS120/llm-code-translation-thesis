Here's the equivalent Java function for the provided Python code:

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
- The `System.out.println` function is used for printing output in Java, which concatenates strings using the `+` operator.
- The `main` method is the entry point of the Java program, similar to the `if __name__ == '__main__':` block in Python.