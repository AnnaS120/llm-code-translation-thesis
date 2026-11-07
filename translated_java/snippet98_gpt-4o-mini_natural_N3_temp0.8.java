Here is the equivalent Java method that follows the correct Java syntax and conventions:

```java
public class MultiplicationTable {

    public static void main(String[] args) {
        main();
    }

    public static void main() {
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

### Key Changes:
1. **Class Definition**: The Java code is encapsulated within a class (`MultiplicationTable`).
2. **Method Naming**: The `main` method is defined in a way that it can be executed as the entry point of the program.
3. **Printing**: Used `System.out.print` for the same line output and `System.out.println` to print the result of the multiplication.
4. **Loop Syntax**: Java uses a slightly different syntax for `for` loops compared to Python. 

This code will produce the same multiplication table output as the original Python function.