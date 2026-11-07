Here is the equivalent Java function that translates the provided Python code:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int idx = 1; idx < 10; idx++) {
            for (int k = 1; k < 10; k++) {
                System.out.print(idx);
                System.out.print("x");
                System.out.print(k);
                System.out.print("=");
                System.out.println(idx * k); // Use println to move to the next line after each result
            }
        }
    }
}
```

### Explanation:

- The outer loop iterates from 1 to 9 (inclusive).
- The inner loop also iterates from 1 to 9 (inclusive).
- `System.out.print` is used to print without moving to a new line, similar to Python's `print(..., end="")`.
- `System.out.println` is used to print the product and move to a new line after each calculation.