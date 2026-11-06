Sure! Below is the Java method that replicates the functionality of the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        int a = 1;
        for (int j = 0; j < 9; j++) {
            int b = 1;
            for (int i = 0; i < 9; i++) {
                System.out.println(a + " x " + b + " = " + (a * b));
                b++;
            }
            a++;
        }
    }
}
```

### Explanation:
1. **Class Declaration**: The method is contained in a class named `MultiplicationTable`.
2. **Main Method**: The `main` method serves as the entry point for the program.
3. **Method Definition**: The `printMultiplicationTable` method encapsulates the logic.
4. **Loop Structure**: The outer and inner loops are implemented using `for` loops, similar to Python.
5. **Printing**: The `System.out.println` method is used to print the output in the specified format.
6. **Variable Incrementation**: The variables `a` and `b` are incremented in the same way as in the original Python code.