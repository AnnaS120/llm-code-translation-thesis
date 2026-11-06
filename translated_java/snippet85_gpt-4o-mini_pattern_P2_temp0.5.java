Here’s the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        for (int idx = 1; idx < 10; idx++) {
            for (int k = 1; k < 10; k++) {
                System.out.println(idx + "x" + k + "=" + (idx * k));
            }
        }
    }
}
```

### Explanation:
1. **Class Definition**: In Java, you need to define a class. Here, I've named it `MultiplicationTable`.
2. **Main Method**: The `main` method is the entry point of the program, similar to the `if __name__ == '__main__':` block in Python.
3. **Method Definition**: The `solve` method is defined as a static method, just like in Python.
4. **Loops**: The `for` loops are similar, but the syntax is slightly different in Java.
5. **Printing**: Instead of `print`, we use `System.out.println` to print the output in Java. 

This code will generate the same multiplication table as the original Python function.