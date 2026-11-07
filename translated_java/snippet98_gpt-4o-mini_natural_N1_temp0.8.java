Certainly! Below is the translated Python function into Java:

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
1. **Class Declaration**: In Java, everything needs to be inside a class.
2. **Main Method**: The `main` method is defined as `public static void main(String[] args)`.
3. **Loops**: The `for` loops are similar in both languages, but Java requires explicit type declaration.
4. **Printing**: Instead of `print`, we use `System.out.print()` for the same behavior in Java, and `System.out.println()` to print with a newline after the output. 

You can copy and paste this Java code into a Java development environment and run it to see the same output as the Python version.