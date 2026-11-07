Certainly! Below is a valid Java implementation of the provided Python snippet. The Java code will produce the same output, which is a multiplication table from 1 to 9.

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
- The outer loop iterates over the values of `i` from 1 to 9.
- The inner loop iterates over the values of `j` from 1 to 9.
- The `System.out.printf` method is used to format the output similar to Python's `sys.stdout.write` method with formatted strings.
- `%n` is used for a platform-independent newline in Java. 

You can run this Java code in any Java environment, and it will produce the same multiplication table output as the original Python snippet.