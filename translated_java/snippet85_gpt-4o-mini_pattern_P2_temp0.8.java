Here’s the equivalent Java code for the given Python function:

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
1. **Class Declaration**: The code is wrapped in a class called `MultiplicationTable`, which is required in Java.
2. **Main Method**: The `main` method is the entry point of the program, where `solve()` is called.
3. **Method Definition**: The `solve` method contains the nested loops, similar to the Python function.
4. **Output**: Instead of `print()`, Java uses `System.out.println()` to print output to the console. 

### Usage:
You can compile this Java code and run it to see the multiplication table output similar to the Python version.