Here is the Java equivalent of the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        int a = 1;
        for (int j = 0; j < 9; j++) {
            int b = 1;
            for (int i = 0; i < 9; i++) {
                System.out.println(a + "x" + b + "=" + (a * b));
                b = b + 1;
            }
            a = a + 1;
        }
    }
}
```

This Java code performs the same functionality as the provided Python function, printing the multiplication table from 1x1 to 9x9.