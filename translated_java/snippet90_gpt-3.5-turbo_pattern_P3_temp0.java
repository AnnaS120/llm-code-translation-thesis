Here is the equivalent Java code for the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;
        
        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```