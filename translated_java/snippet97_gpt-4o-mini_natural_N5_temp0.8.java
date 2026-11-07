Sure! Below is the equivalent Java code that performs the same operation as your provided Python code. This Java code uses appropriate data types and method structure:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
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
1. **Class Declaration**: In Java, code should be inside a class. Here, I've named the class `MultiplicationTable`.
2. **Main Method**: The `main` method is the entry point of any Java program.
3. **Loop Structure**: Two nested `for` loops are used, similar to the Python version.
4. **Printing**: `System.out.println` is used for printing, concatenating strings and values as needed.
5. **Variable Types**: `int` is used for integer variables `a` and `b`.

### Compilation:
You can compile this Java code using `javac MultiplicationTable.java` and run it using `java MultiplicationTable`.