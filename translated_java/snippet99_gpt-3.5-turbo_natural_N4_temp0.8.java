Here is the equivalent Java implementation of the given Python snippet:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%dx%d=%d%n", i, j, i*j);
            }
        }
    }
}
```

In this Java implementation, we use a nested for loop structure to iterate over the numbers from 1 to 9 and print the multiplication table in the same format as the original Python code.