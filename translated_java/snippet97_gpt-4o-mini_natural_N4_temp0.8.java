Here’s a valid Java implementation of the provided Python snippet. The Java program will produce the same output as the original Python code.

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1;

        for (int j = 0; j < 9; j++) {
            int b = 1;
            for (int i = 0; i < 9; i++) {
                System.out.println(a + "x" + b + "=" + (a * b));
                b++;
            }
            a++;
        }
    }
}
```

### Explanation:
- We initialize `a` to 1.
- The outer loop runs 9 times (representing the rows).
- Inside the outer loop, we initialize `b` to 1 for each row, then run an inner loop, also 9 times (representing the columns).
- Inside the inner loop, we print the format `a x b = a*b`.
- After printing, we increment `b` and then increment `a` after the inner loop completes.

This Java version maintains the same structure and functionality as the original Python code.