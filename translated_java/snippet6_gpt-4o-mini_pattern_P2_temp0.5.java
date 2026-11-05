Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int idx = 0; idx < 10; idx++) {
            int t = list.remove(0); // Remove the first element
            list.add(t); // Append it to the end
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in reverse order

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(list.get(idx)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **List Initialization**: We use `ArrayList<Integer>` to create a dynamic list similar to Python's list.
2. **Element Manipulation**: The `remove(0)` method removes the first element, and `add(t)` appends it to the end of the list.
3. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: We use `System.out.println()` to print the first three elements of the sorted list.