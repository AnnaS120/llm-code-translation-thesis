Here's the equivalent Java code that replicates the functionality of the provided Python code. This Java code uses appropriate data types and method structure to compile successfully:

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
- **Class Definition**: The Java code is encapsulated in a class named `MultiplicationTable`.
- **Main Method**: The program execution starts from the `main` method, which is the entry point.
- **Loop Structure**: The nested for-loops are used to iterate from 1 to 9, similar to the Python code.
- **Output**: The `System.out.printf` method is used for formatted output, similar to the `sys.stdout.write` in Python, with `%n` used to insert a new line.