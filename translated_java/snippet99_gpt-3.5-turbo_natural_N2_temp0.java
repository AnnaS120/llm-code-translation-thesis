Here is the equivalent Java code for the given Python code:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%dx%d=%d\n", i, j, i * j);
            }
        }
    }
}
```

In Java, we use `System.out.printf` to format the output similar to Python's `%` formatting.