Here is the translation of the Python code into Java:

```java
import java.util.Arrays;

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
            int lastElement = h[N11];
            for (int i = N11; i < h.length - 1; i++) {
                h[i] = h[i + 1];
            }
            h[h.length - 1] = lastElement;
        }

        Arrays.sort(h);
        for (int i = h.length - 1; i >= h.length - N14; i--) {
            System.out.println(h[i]);
        }
    }
}
```

This Java code performs the same operations as the Python code provided. It initializes the variables, manipulates the array `h` according to the given logic, sorts the array in descending order, and then prints the top `N14` elements.