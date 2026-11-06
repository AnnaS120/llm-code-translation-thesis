Here’s the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;
        solve(N1, N2);
    }

    public static void solve(int N1, int N2) {
        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
- The `solve` function is translated into a static method in the `MultiplicationTable` class.
- The `for` loops and the print statement are adapted to Java syntax.
- The `main` method serves as the entry point of the program, similar to the `if __name__ == '__main__':` block in Python.