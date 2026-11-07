Here’s how you can rewrite the provided Python function as a Java method, following Java syntax and conventions:

```java
public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%dx%d=%d\n", i, j, i * j);
            }
        }
    }
}
```

### Explanation:
1. **Class Declaration**: In Java, all methods must be contained within a class. Here, we created a class named `MultiplicationTable`.
2. **Main Method**: The `main` method is the entry point of any Java application.
3. **Method Definition**: The `printMultiplicationTable` method contains the logic for printing the multiplication table.
4. **Loops**: The `for` loops are similar to Python but use Java's syntax.
5. **Output**: `System.out.printf` is used for formatted output, similar to Python's `sys.stdout.write`.