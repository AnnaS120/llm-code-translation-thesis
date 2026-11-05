Here is the Java code equivalent to the given Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int n = 0; n < N; n++) {
            int popped = h[0];
            for (int i = 0; i < h.length - 1; i++) {
                h[i] = h[i + 1];
            }
            h[h.length - 1] = popped;
        }

        Arrays.sort(h);
        int[] sortedH = new int[h.length];
        for (int i = 0; i < h.length; i++) {
            sortedH[i] = h[h.length - 1 - i];
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(sortedH[i]);
        }
    }
}
```

In this Java code:
- The array `h` is initialized with the given values.
- The array `h` is rotated `N` times by shifting elements to the left.
- The array `h` is sorted in descending order.
- The top 3 elements are printed.