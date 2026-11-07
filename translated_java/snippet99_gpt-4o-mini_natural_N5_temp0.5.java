Here’s how you can convert the given Python code to Java. The Java code will use appropriate data types and method structure to achieve the same functionality:

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
- **Class Declaration**: In Java, code must be contained within a class. Here, we named the class `MultiplicationTable`.
- **Main Method**: The `main` method is the entry point for any Java application.
- **Loops**: The nested `for` loops work similarly to Python, iterating from 1 to 9.
- **Output**: `System.out.printf` is used to format the output string, similar to Python's `sys.stdout.write` with string formatting. The `%n` is used for a new line in Java, which is platform-independent. 

This Java code will compile successfully and produce the same multiplication table output as the original Python code.