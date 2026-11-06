Here is the equivalent Java code for the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;
        
        for (int j = N2; j < N1; j++) {
            for (int i = N2; i < N1; i++) {
                System.out.println(j + "x" + i + "=" + (i*j));
            }
        }
    }
}
```