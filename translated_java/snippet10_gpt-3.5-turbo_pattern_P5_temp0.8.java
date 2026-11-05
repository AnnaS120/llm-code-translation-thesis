Here is the equivalent function in Java:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mt = {90, 99, 69, 5, 27, 13, 94, 88, 77, 77};

        for (int i = 0; i < 10; i++) {
            int removed = mt[0];
            for (int j = 0; j < mt.length - 1; j++) {
                mt[j] = mt[j + 1];
            }
            mt[mt.length - 1] = removed;
        }

        Arrays.sort(mt);
        System.out.println(mt[mt.length - 1]);
        System.out.println(mt[mt.length - 2]);
        System.out.println(mt[mt.length - 3]);
    }
}
```