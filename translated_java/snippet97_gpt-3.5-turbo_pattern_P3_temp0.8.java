Sure, here is the Java equivalent of the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        int N1 = 9;
        int N2 = 1;
        int a = N2;
        
        for (int j = 0; j < N1; j++) {
            int b = N2;
            for (int i = 0; i < N1; i++) {
                System.out.println(a + "x" + b + "=" + a*b);
                b = b + N2;
            }
            a = a + N2;
        }
    }
}
```