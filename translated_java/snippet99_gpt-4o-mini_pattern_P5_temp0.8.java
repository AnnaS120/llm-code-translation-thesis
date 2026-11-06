Sure! Here's the equivalent Java code for the given Python function:

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
1. **Loop Structure**: The `for` loops in Java are similar to those in Python. The range `1 to 10` in Python translates to `1 to 9` in Java since the upper limit is exclusive in both languages.
  
2. **Output**: The `System.out.printf` method is used in Java to format the output, similar to `sys.stdout.write` in Python. The `%d` format specifier is used for integers, and `%n` is used for a new line.

3. **Main Method**: Java programs require a `main` method to run, which is where the execution starts.

You can run this Java code in any Java development environment or online compiler. It will output the multiplication table from 1 to 9, just like the original Python code.