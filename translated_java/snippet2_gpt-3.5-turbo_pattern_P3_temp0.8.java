Here is the Java equivalent of the given Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 98;
        int N2 = 17;
        int N3 = 93;
        int N4 = 10;
        int N5 = 13;
        int N6 = 84;
        int N7 = 37;
        int N8 = 66;
        int N9 = 70;
        int N10 = 72;
        int N11 = 0;
        int N12 = 1;
        int N13 = 8;
        int N14 = 3;

        int[] h = {N8, N5, N12, N10, N6, N3, N9, N7, N2, N1};
        int N = N4;

        for (int n = 0; n < N; n++) {
            int lastElement = h[h.length - 1];
            for (int i = h.length - 1; i > 0; i--) {
                h[i] = h[i - 1];
            }
            h[0] = lastElement;
        }

        ArrayList<Integer> sortedList = new ArrayList<>();
        for (int value : h) {
            sortedList.add(value);
        }
        Collections.sort(sortedList, Collections.reverseOrder());

        for (int i = 0; i < N14; i++) {
            System.out.println(sortedList.get(i));
        }
    }
}
```

This Java code performs the same operations as the given Python function, including the manipulation of the `h` array and printing the sorted elements.