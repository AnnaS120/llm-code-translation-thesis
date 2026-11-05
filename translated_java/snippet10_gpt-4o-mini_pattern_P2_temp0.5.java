Here’s a translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int idx = 0; idx < 10; idx++) {
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(mt); // Sort the list

        // Print the last three elements in descending order
        System.out.println(mt.get(9)); // 1st largest
        System.out.println(mt.get(8)); // 2nd largest
        System.out.println(mt.get(7)); // 3rd largest
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to Python's list.
2. **Collections.addAll**: This is used to initialize the list with the given elements.
3. **Loop**: The `for` loop iterates 10 times, using `remove(0)` to take the first element and `add()` to append it to the end of the list.
4. **Sorting**: `Collections.sort(mt)` sorts the list in ascending order.
5. **Printing**: We access the last three elements using `get()` method, which corresponds to the 1st, 2nd, and 3rd largest values after sorting.