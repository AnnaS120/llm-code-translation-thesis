Here is the Java code equivalent to the given Python code:

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
        for (int i = h.length - 1; i >= h.length - 3; i--) {
            System.out.println(h[i]);
        }
    }
}
```

This Java code performs the same operations as the given Python code, including rotating the elements in the array `h`, sorting it in descending order, and printing the top 3 elements.