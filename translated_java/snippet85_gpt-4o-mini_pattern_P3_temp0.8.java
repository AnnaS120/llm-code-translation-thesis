Here's the equivalent Java code for your provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        int N1 = 10;
        int N2 = 1;

        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
1. The `solve` method implements the same nested loops and logic as the Python function.
2. The `System.out.println` statement formats the output similarly to the Python `print` function.
3. The main method calls the `solve` method when the program is executed. 

You can compile and run this Java program, and it will produce the same output as your Python code.