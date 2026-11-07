Here is the Java equivalent of the given Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1;
        for (int j = 0; j < 9; j++) {
            int b = 1;
            for (int i = 0; i < 9; i++) {
                System.out.println(a + "x" + b + "=" + a * b);
                b++;
            }
            a++;
        }
    }
}
```