Certainly! Below is the equivalent Java code for the provided Python code:

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
1. **Variables**: `a` and `b` are declared as integers.
2. **Outer Loop**: The outer loop runs 9 times (from 0 to 8), similar to the Python `range(9)`.
3. **Inner Loop**: The inner loop also runs 9 times, printing the multiplication table.
4. **Print Statement**: The `System.out.println` method is used to print the output, concatenating strings and variables similar to the Python `print` function with `sep=''`.
5. **Incrementing**: Both `b` and `a` are incremented after their respective loops.

This Java code will produce the same multiplication table output as the original Python code.