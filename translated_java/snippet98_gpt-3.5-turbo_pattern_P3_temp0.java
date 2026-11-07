Here is the equivalent Java code for the given Python function:

```java
public class Main {
    static int N1 = 10;
    static int N2 = 1;

    public static void main(String[] args) {
        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
                System.out.print(i);
                System.out.print("x");
                System.out.print(j);
                System.out.print("=");
                System.out.println(i * j);
            }
        }
    }
}
```