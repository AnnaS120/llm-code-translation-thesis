Here is the equivalent Java code for the given Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                int ans = x * y;
                System.out.println(x + "x" + y + "=" + ans);
            }
        }
    }
}
```