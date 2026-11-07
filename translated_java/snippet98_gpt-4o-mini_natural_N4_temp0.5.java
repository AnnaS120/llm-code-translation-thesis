Certainly! Below is the Java implementation of the provided Python snippet, preserving its original behavior:

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
- The outer loop iterates `i` from 1 to 9.
- The inner loop iterates `j` from 1 to 9.
- For each combination of `i` and `j`, it prints the multiplication expression in the format `ixj=i*j`.
- The `System.out.print()` method is used to avoid adding a new line after each print, while `System.out.println()` is used to print the result of the multiplication and move to the next line.