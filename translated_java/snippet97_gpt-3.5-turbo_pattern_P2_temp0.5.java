Here is the equivalent Java code for the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        int a = 1;
        for (int k = 0; k < 9; k++) {
            int b = 1;
            for (int idx = 0; idx < 9; idx++) {
                System.out.println(a + "x" + b + "=" + a * b);
                b++;
            }
            a++;
        }
    }
}
```