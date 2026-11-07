Here is the equivalent Java implementation of the given Python snippet:

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

This Java code will produce the same output as the original Python snippet, printing the multiplication table from 1x1 to 9x9.