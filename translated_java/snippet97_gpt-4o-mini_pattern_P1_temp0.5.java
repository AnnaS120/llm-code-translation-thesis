Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int x = 1;
        for (int j = 0; j < 9; j++) {
            int y = 1;
            for (int i = 0; i < 9; i++) {
                System.out.print(x + "x" + y + "=" + (x * y) + "\n");
                y++;
            }
            x++;
        }
    }
}
```

### Explanation:
- The outer loop (`for j in range(9)`) iterates 9 times, similar to `for (int j = 0; j < 9; j++)` in Java.
- The inner loop (`for i in range(9)`) also iterates 9 times, represented by `for (int i = 0; i < 9; i++)`.
- The `print` statement in Python is replaced by `System.out.print` in Java.
- The `sep=''` in Python is handled by concatenating the strings directly in Java.
- The increment of `y` and `x` is done using the `++` operator in Java.