Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int x = 1;
        int y;
        int c;

        while (x < 10) {
            y = 1; // Reset y for each new x
            while (y < 10) {
                c = x * y;
                System.out.println(x + "x" + y + "=" + c);
                y++;
            }
            x++;
        }
    }
}
```

### Explanation:
- The outer `while` loop iterates over `x` from 1 to 9 (inclusive).
- The inner `while` loop iterates over `y` from 1 to 9 (inclusive).
- For each combination of `x` and `y`, it calculates the product `c` and prints the result in the specified format.
- The variable `y` is reset to `1` for each new value of `x` to ensure the inner loop starts from 1 each time.