Here is the equivalent Java code for the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        for (int idx = 1; idx < 10; idx++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%dx%d=%d\n", idx, k, idx * k);
            }
        }
    }
}
```