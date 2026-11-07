Here's the equivalent Java code for the provided Python snippet:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%dx%d=%d%n", i, j, i * j);
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates from 1 to 9 (inclusive of 1 and exclusive of 10).
- The inner loop does the same.
- The `System.out.printf` method is used to format the output similarly to Python's string formatting with `"%dx%d=%d\n"`.
- The `%n` in the format string is used to represent a new line in Java, which is platform-independent.