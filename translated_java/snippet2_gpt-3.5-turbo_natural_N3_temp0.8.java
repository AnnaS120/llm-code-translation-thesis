```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int n = 0; n < N; n++) {
            int firstElement = h[0];
            System.arraycopy(h, 1, h, 0, h.length - 1);
            h[h.length - 1] = firstElement;
        }

        Arrays.sort(h, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(h[i]);
        }
    }
}
```