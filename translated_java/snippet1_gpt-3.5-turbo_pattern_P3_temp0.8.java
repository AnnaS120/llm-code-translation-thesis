Here is the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 100;
        int N2 = 80;
        int N3 = 96;
        int N4 = 93;
        int N5 = 58;
        int N6 = 10;
        int N7 = 45;
        int N8 = 98;
        int N9 = 57;
        int N10 = 54;
        int N11 = 0;
        int N12 = 3;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(N12);
        arr.add(N10);
        arr.add(N9);
        arr.add(N7);
        arr.add(N4);
        arr.add(N8);
        arr.add(N2);
        arr.add(N1);
        arr.add(N5);
        arr.add(N3);

        for (int i = 0; i < N6; i++) {
            arr.add(arr.remove(N11));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N12; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

This Java code accomplishes the same functionality as the provided Python function, including initializing the array with specific values, manipulating the array elements, sorting the array in reverse order, and printing the first N12 elements of the sorted array.