Here's the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1;
        for (int k = 0; k < 9; k++) {
            int b = 1;
            for (int idx = 0; idx < 9; idx++) {
                System.out.println(a + " x " + b + " = " + (a * b));
                b++;
            }
            a++;
        }
    }
}
```

### Explanation:
- The outer loop (`for k in range(9)`) iterates 9 times, similar to the Java `for` loop with `int k = 0; k < 9; k++`.
- The inner loop (`for idx in range(9)`) also iterates 9 times.
- The `print` function in Python is replaced by `System.out.println` in Java.
- The multiplication operation is done using `a * b` in both languages. 

This Java code will produce the same output as the original Python function, which is a multiplication table from 1 to 9.