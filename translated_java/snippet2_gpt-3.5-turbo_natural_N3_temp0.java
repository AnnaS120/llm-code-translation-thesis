```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int n = 0; n < N; n++) {
            h = Arrays.copyOfRange(h, 1, h.length + 1);
            h[h.length - 1] = Integer.parseInt(String.valueOf(h[0]));
        }

        Arrays.sort(h, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(h[i]);
        }
    }
}
```