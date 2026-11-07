Here is the equivalent Java code for the given Python code:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%dx%d=%d\n", i, j, i * j);
            }
        }
    }
}
```

In this Java code:
- We have a class named `MultiplicationTable`.
- The `main` method is the entry point of the program.
- We use a nested loop to iterate over the values of `i` and `j` from 1 to 9.
- We use `System.out.printf` to format and print the multiplication table in the desired format.