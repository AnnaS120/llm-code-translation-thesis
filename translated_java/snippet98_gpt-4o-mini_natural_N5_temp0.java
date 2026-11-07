Here’s the equivalent Java code that compiles successfully, using appropriate data types and method structure:

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

### Explanation:
1. **Class Declaration**: In Java, all code must be inside a class. Here, we named the class `MultiplicationTable`.
2. **Main Method**: The entry point of a Java program is the `main` method, which is defined as `public static void main(String[] args)`.
3. **Method Structure**: The original `main` function is converted to a static method in the Java class.
4. **Loop Structure**: The `for` loops are similar in structure to Python, but we specify the data type (`int`) for the loop variables.
5. **Printing**: The `print` function in Python is replaced with `System.out.print` and `System.out.println` in Java for output. 

This code will produce the same multiplication table output as the original Python code.