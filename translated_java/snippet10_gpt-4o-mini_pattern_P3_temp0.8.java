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

        // Initialize the list with the specified values
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

        // Append N6 times the first element popped from the list
        for (int i = 0; i < N6; i++) {
            mt.add(mt.remove(N10)); // remove the element at index N10 (0) and add it back to the end
        }

        // Sort the list
        Collections.sort(mt);

        // Print out the elements at the specified indices
        System.out.println(mt.get(N11)); // 9th index
        System.out.println(mt.get(N12)); // 8th index
        System.out.println(mt.get(N14)); // 7th index
    }
}
```

### Explanation:
1. **ArrayList**: Used `ArrayList<Integer>` to create a dynamic array.
2. **Adding Elements**: Used `add()` method to add elements to the list.
3. **Looping**: The for loop runs `N6` times, each time removing the first element and adding it to the end of the list.
4. **Sorting**: Used `Collections.sort()` to sort the list.
5. **Accessing Elements**: Accessed elements using `get()` method and printed them out.