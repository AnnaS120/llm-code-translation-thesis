Here is the Java equivalent of the given Python code:

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

In Java, we use `System.out.printf` to format and print the output. The loop ranges from 1 to 9 inclusive, similar to the Python code.