Here’s the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        // Loop through numbers 1 to 9
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                // Print the multiplication result
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
- The `main` method serves as the entry point of the Java program, similar to the `if __name__ == '__main__':` in Python.
- Two nested `for` loops iterate from 1 to 9, just like in the Python code.
- The `System.out.println` method is used to print the formatted string, which combines the values of `i`, `j`, and their product.