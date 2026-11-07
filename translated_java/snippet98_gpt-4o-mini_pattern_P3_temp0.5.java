Here’s how you can translate the provided Python function into Java:

```java
public class Main {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;

        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
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
1. **Class Declaration**: In Java, all code must be contained within a class. Here, we define a class named `Main`.
2. **Main Method**: The `main` method is the entry point of the program, similar to the `if __name__ == "__main__":` block in Python.
3. **Variable Declaration**: We declare `N1` and `N2` as integers.
4. **Loops**: The `for` loops in Java are similar to those in Python. The syntax is slightly different but achieves the same purpose.
5. **Printing**: Java uses `System.out.print` and `System.out.println` for output. `print` is used for the same line output, while `println` moves to the next line after printing. 

This Java code will produce the same output as the original Python code.