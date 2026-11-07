You can translate the given Python list comprehension into a Java method that prints the multiplication table. Here's how you can do it in Java:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates over values of `i` from 1 to 9.
- The inner loop iterates over values of `j` from 1 to 9.
- The `System.out.println` statement formats the output similarly to the Python `print` function with `format`.