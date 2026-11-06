Here is the Java equivalent of the given Python code:

```java
public class Main {
    public static void main(String[] args) {
        for (int idx = 1; idx <= 9; idx++) {
            for (int k = 1; k <= 9; k++) {
                System.out.printf("%dx%d=%d\n", idx, k, idx * k);
            }
        }
    }
}
```