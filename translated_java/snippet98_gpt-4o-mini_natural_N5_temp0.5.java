Here’s the equivalent Java code for the provided Python code. This code uses appropriate data types and method structure to compile successfully in Java:

```java
public class Main {
    public static void main(String[] args) {
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
1. **Class Definition**: Java requires a class definition, so we define a class named `Main`.
2. **Main Method**: The entry point of the program is the `main` method, which is declared as `public static void main(String[] args)`.
3. **For Loops**: The loops iterate from 1 to 9, similar to Python's `range(1, 10)`.
4. **Printing**: We use `System.out.print()` for inline printing and `System.out.println()` to move to the next line after printing the product.
5. **Data Types**: We use `int` as the data type for the loop variables `i` and `j`.

This Java code will produce the same output as the original Python code.