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
- The outer loop in Python iterates `j` from `0` to `8`, which is equivalent to `j < 9` in Java.
- The inner loop iterates `i` from `0` to `8`, which is similarly handled with `i < 9` in Java.
- The `print` function in Python is replaced with `System.out.println` in Java.
- The `sep=''` functionality in Python is achieved by concatenating strings in Java.