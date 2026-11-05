Sure, here is the equivalent function in Java:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int i = 0; i < N; i++) {
            int val = h[0];
            System.arraycopy(h, 1, h, 0, h.length - 1);
            h[h.length - 1] = val;
        }

        Arrays.sort(h, Collections.reverseOrder());

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(h[idx]);
        }
    }
}
```