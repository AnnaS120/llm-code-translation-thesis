Here is the equivalent Java code for the provided Python function:

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

        ArrayList<Integer> h = new ArrayList<>();
        h.add(N8);
        h.add(N5);
        h.add(N12);
        h.add(N10);
        h.add(N6);
        h.add(N3);
        h.add(N9);
        h.add(N7);
        h.add(N2);
        h.add(N1);
        
        int N = N4;

        for (int n = 0; n < N; n++) {
            h.add(h.remove(N11));
        }

        Collections.sort(h, Collections.reverseOrder());

        for (int i = 0; i < N13; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation:
1. **Variable Initialization**: The variables `N1` to `N14` are initialized similarly as in Python.
2. **List Creation**: An `ArrayList` is used to hold the elements which is similar to Python's list.
3. **Looping with Range**: A `for` loop is used to replicate the behavior of Python's `range`.
4. **List Modification**: The `remove` and `add` methods of `ArrayList` are used to manipulate elements.
5. **Sorting**: The `Collections.sort()` method is used with `Collections.reverseOrder()` to sort the list in descending order.
6. **Printing Elements**: The printing of elements is done using `System.out.println()`.

This code should function the same way as the provided Python code.