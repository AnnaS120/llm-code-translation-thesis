Sure, here is the equivalent Java code for the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                output(i, j);
            }
        }
    }

    public static void output(int i, int j) {
        System.out.println(i + "x" + j + "=" + i*j);
    }
}
```