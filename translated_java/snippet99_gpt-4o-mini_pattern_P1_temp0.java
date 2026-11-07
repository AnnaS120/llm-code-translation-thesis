Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\n");
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates from 1 to 9 (inclusive).
- The inner loop also iterates from 1 to 9 (inclusive).
- The `System.out.print` method is used to print the multiplication results, similar to `sys.stdout.write` in Python.
- The `"\n"` at the end of the print statement ensures that each result is printed on a new line.