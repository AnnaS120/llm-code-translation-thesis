Certainly! Here is the equivalent Java code for the given Python snippet:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int n = 0; n < N; n++) {
            int popped = h[0];
            for (int i = 1; i < h.length; i++) {
                h[i - 1] = h[i];
            }
            h[h.length - 1] = popped;
        }

        Arrays.sort(h);
        for (int i = h.length - 1; i >= h.length - 3; i--) {
            System.out.println(h[i]);
        }
    }
}
```

This Java code replicates the behavior of the original Python code.