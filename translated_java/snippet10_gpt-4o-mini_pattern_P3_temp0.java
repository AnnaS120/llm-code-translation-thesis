Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 99;
        int N2 = 94;
        int N3 = 69;
        int N4 = 77;
        int N5 = 88;
        int N6 = 10;
        int N7 = 90;
        int N8 = 13;
        int N9 = 27;
        int N10 = 0;
        int N11 = 9;
        int N12 = 8;
        int N13 = 5;
        int N14 = 7;

        ArrayList<Integer> mt = new ArrayList<>();
        mt.add(N7);
        mt.add(N1);
        mt.add(N3);
        mt.add(N13);
        mt.add(N9);
        mt.add(N8);
        mt.add(N2);
        mt.add(N5);
        mt.add(N4);
        mt.add(N4);

        for (int i = 0; i < N6; i++) {
            mt.add(mt.remove(N10));
        }

        Collections.sort(mt);
        System.out.println(mt.get(N11));
        System.out.println(mt.get(N12));
        System.out.println(mt.get(N14));
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` and `Collections` for dynamic array handling and sorting.
2. **Variable Initialization**: The integer variables are initialized similarly to Python.
3. **ArrayList**: We use `ArrayList<Integer>` to store the values, similar to the list in Python.
4. **Loop**: The loop iterates `N6` times, removing the element at index `N10` (which is `0`) and adding it back to the end of the list.
5. **Sorting**: We use `Collections.sort()` to sort the list.
6. **Output**: Finally, we print the elements at the specified indices using `mt.get()`.

This Java code replicates the functionality of the original Python code.