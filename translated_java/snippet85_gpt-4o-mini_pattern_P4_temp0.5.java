Here’s how you can translate the given Python function into Java:

```java
public class MultiplicationTable {

    public static void solve() {
        for (int i = 1; i < 10; i++) {  // loop iteration
            for (int j = 1; j < 10; j++) {  // loop iteration
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }

    public static void main(String[] args) {  // condition check
        solve();
    }
}
```

### Explanation:
1. **Class Definition**: In Java, you need to define a class. Here, I've named it `MultiplicationTable`.
2. **Method Definition**: The `solve` method contains the logic to print the multiplication table.
3. **Loop Structure**: The nested loops are similar to Python, but use Java's syntax for loops.
4. **Printing**: The `System.out.println` method is used to print output in Java, similar to `print` in Python.
5. **Main Method**: The `main` method serves as the entry point for the program, similar to the `if __name__ == '__main__':` check in Python. 

You can run this Java program, and it will produce the same output as the Python function.