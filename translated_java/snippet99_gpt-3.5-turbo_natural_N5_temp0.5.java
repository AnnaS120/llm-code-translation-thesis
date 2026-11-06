Here is the Java code equivalent of the provided Python code:

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

In Java, we use `System.out.printf()` to format the output similar to Python's `%d` formatting. The loop ranges are adjusted to match the behavior of the Python code.