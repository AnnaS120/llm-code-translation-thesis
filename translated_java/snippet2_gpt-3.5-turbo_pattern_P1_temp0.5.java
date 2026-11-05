Here is the equivalent Java code for the given Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int count = 0; count < N; count++) {
            int temp = h[0];
            System.arraycopy(h, 1, h, 0, h.length - 1);
            h[h.length - 1] = temp;
        }

        Arrays.sort(h);

        for (int i = h.length - 1; i >= h.length - 3; i--) {
            System.out.println(h[i]);
        }
    }
}
```

This Java code performs the same operations as the given Python function, including rotating the array elements, sorting the array in descending order, and printing the top 3 elements of the sorted array.