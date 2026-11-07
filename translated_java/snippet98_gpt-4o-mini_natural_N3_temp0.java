Here’s the equivalent Java method for the provided Python function, following correct Java syntax and conventions:

```java
public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i);
                System.out.print("x");
                System.out.print(j);
                System.out.print("=");
                System.out.println(i * j);
            }
        }
    }
}
```

### Explanation:
- The `main` method serves as the entry point of the program.
- The `printMultiplicationTable` method contains the nested loops to generate the multiplication table.
- `System.out.print` is used to print without a newline, while `System.out.println` is used to print with a newline at the end.