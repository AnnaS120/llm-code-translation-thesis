Sure, here is the Java code equivalent to the given Python code snippet:

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

In this Java version, we use `System.out.printf` to format the output similar to the Python code. The loops iterate from 1 to 9 inclusive, just like in the original Python code.