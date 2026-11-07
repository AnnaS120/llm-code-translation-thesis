Here’s the equivalent Java method following correct syntax and conventions:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\n");
            }
        }
    }
}
```

### Explanation:
- The `main` method serves as the entry point for the program.
- The `printMultiplicationTable` method contains the nested loops that generate the multiplication table.
- `System.out.print` is used to print the output without a newline, and `\n` is added to move to the next line after each complete multiplication statement.
- The use of `+` for string concatenation is standard in Java.