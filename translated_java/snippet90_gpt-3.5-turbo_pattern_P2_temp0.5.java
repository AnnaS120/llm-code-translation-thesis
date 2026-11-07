Here is the equivalent Java code for the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        for (int idx = 1; idx <= 9; idx++) {
            for (int k = 1; k <= 9; k++) {
                System.out.println(idx + "x" + k + "=" + (idx * k));
            }
        }
    }
}
```