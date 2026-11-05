Here's the equivalent Java code for your Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0);  // Remove the first element
            lists.add(a);  // Add it to the end of the list
        }

        Collections.sort(lists, Collections.reverseOrder());  // Sort in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i));  // Print the first 3 elements
        }
    }
}
```

### Breakdown of the Code:

1. **Imports**: We import `ArrayList` and `Collections` to use dynamic arrays and utility functions for sorting.

2. **Initialization**: We initialize the `lists` variable as an `ArrayList` of integers and populate it with values.

3. **Looping Through the List**: A loop removes the first element and appends it to the end of the list, just like the `pop(0)` and `append()` operations in Python.

4. **Sorting**: The list is sorted in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.

5. **Printing**: Finally, we print the first three elements of the sorted list.

This Java code performs the same operations as your original Python code.