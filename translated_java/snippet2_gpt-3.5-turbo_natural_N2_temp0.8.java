```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int n = 0; n < N; n++) {
            h = appendAndPop(h);
        }

        Arrays.sort(h, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(h[i]);
        }
    }

    public static Integer[] appendAndPop(Integer[] arr) {
        int firstElement = arr[0];
        Integer[] result = Arrays.copyOfRange(arr, 1, arr.length + 1);
        result[result.length - 1] = firstElement;
        return result;
    }
}
```