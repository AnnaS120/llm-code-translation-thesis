Here’s how you can translate the given Python function into Java:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1;
        for (int k = 0; k < 9; k++) {
            int b = 1;
            for (int idx = 0; idx < 9; idx++) {
                System.out.println(a + "x" + b + "=" + (a * b));
                b++;
            }
            a++;
        }
    }
}
```

### Explanation:
1. **Variable Initialization**: The variables `a` and `b` are initialized similarly in both languages.
2. **Loops**: The outer and inner loops are translated using `for` loops in Java.
3. **Printing**: The `print` function in Python is replaced with `System.out.println` in Java, and string concatenation is done using the `+` operator.
4. **Incrementing**: The increment operations (`b++` and `a++`) are the same in both languages.

This Java program will produce the same output as the original Python code, which is a multiplication table from 1 to 9.