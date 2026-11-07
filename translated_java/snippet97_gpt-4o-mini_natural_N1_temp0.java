Here’s how you can translate the given Python function into Java:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1;
        for (int j = 0; j < 9; j++) {
            int b = 1;
            for (int i = 0; i < 9; i++) {
                System.out.println(a + "x" + b + "=" + (a * b));
                b++;
            }
            a++;
        }
    }
}
```

### Explanation:
- The outer loop (`for j in range(9)`) iterates 9 times, corresponding to the variable `a`.
- The inner loop (`for i in range(9)`) also iterates 9 times, corresponding to the variable `b`.
- The `System.out.println` method is used to print the formatted output, similar to the `print` function in Python.
- The `sep=''` argument in Python's `print` function is replaced by concatenating strings in Java.