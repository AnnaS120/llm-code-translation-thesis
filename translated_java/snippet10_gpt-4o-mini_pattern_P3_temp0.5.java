Here is the equivalent Java code for the provided Python function:

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

1. **Imports**: The `ArrayList` and `Collections` classes are imported for managing the list and sorting it.
2. **Variable Declaration**: The integers are declared and initialized similarly to the Python version.
3. **ArrayList Initialization**: An `ArrayList<Integer>` is created to hold the values.
4. **Appending Elements**: The `add()` method is used to append elements to the list.
5. **Loop**: The for loop runs `N6` times, where it removes the element at index `N10` (which is `0`) and adds it back to the end of the list.
6. **Sorting**: The `Collections.sort()` method sorts the list.
7. **Printing Values**: The `get()` method retrieves the elements at the specified indices, similar to how indexing works in Python.

This Java code should produce the same output as the original Python function.