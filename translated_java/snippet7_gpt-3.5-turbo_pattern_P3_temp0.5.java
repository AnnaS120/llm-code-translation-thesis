Here is the Java equivalent of the given Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N1 = 95;
        int N2 = 87;
        int N3 = 99;
        int N4 = 55;
        int N5 = 14;
        int N6 = 51;
        int N7 = 69;
        int N8 = 37;
        int N9 = 20;
        int N10 = 3;

        Integer[] mountArray = {N6, N1, N5, N7, N9, N3, N10, N8, N4, N2};
        Arrays.sort(mountArray, (a, b) -> b - a);

        for (int i = 0; i < N10; i++) {
            System.out.println(mountArray[i]);
        }
    }
}
```

In this Java code, we first define the variables N1 to N10 with their respective values. We then create an Integer array `mountArray` with the values of N1 to N10. We use `Arrays.sort` with a custom comparator to sort the array in descending order. Finally, we iterate through the first N10 elements of the sorted array and print them.