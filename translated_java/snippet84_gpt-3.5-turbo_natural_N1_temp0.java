Here is the equivalent Java code for the given Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        while (a < 10) {
            while (b < 10) {
                c = a * b;
                System.out.println(a + "x" + b + "=" + c);
                b++;
            }
            a++;
            b = 1;
        }
    }
}
```