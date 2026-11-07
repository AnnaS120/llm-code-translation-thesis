Here's a translation of the provided Python function into Java:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
```

### Explanation:
- The `for` loops in Java are similar to those in Python, but use the `int` type for the loop variable.
- `System.out.print` is used to print output without a newline, while `System.out.println` is used to move to the next line after finishing a row.
- The `\t` character is used to add a tab space between the outputs, similar to how the output would appear in a formatted table.