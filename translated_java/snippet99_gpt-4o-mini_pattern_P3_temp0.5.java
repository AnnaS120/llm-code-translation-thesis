Here is the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;

        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
                System.out.printf("%dx%d=%d%n", i, j, i * j);
            }
        }
    }
}
```

### Explanation:
1. **Variable Declaration**: Similar to Python, we declare `N1` and `N2` as integers.
2. **Loops**: The nested `for` loops iterate over the range from `N2` to `N1`, just like in Python.
3. **Output**: The `System.out.printf` method is used to format the output, similar to `sys.stdout.write` in Python. The `%n` is used for a new line in Java.