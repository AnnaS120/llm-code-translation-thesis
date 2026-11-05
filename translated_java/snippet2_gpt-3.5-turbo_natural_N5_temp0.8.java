Sure, here is the equivalent Java code for the given Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int n = 0; n < N; n++) {
            int firstElement = h[0];
            for (int i = 0; i < h.length - 1; i++) {
                h[i] = h[i + 1];
            }
            h[h.length - 1] = firstElement;
        }

        Arrays.sort(h);
        int[] reversed = new int[h.length];
        for (int i = 0; i < h.length; i++) {
            reversed[i] = h[h.length - 1 - i];
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(reversed[i]);
        }
    }
}
```

This Java code performs the same operations as the given Python code and prints the top 3 elements of the sorted array `h`.