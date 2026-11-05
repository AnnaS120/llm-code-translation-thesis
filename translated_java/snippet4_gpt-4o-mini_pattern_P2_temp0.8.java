Here's how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int idx = 0; idx < 10; idx++) {
            int a = lists.remove(0); // Remove the first element
            lists.add(a);            // Append it to the end
        }

        // Sort the list in descending order
        Collections.sort(lists, Collections.reverseOrder());

        // Print the top 3 values
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(lists.get(idx));
        }
    }
}
```

### Explanation:
1. **ArrayList Initialization**: We use `ArrayList<Integer>` to create a dynamic array similar to Python's list.
2. **Adding Elements**: The `Collections.addAll` method is used to initialize the list with the given values.
3. **Loop for Moving Elements**: A for loop is used to pop the first element and append it back to the end, similar to the Python `pop(0)` and `append()`.
4. **Sorting**: `Collections.sort` with `Collections.reverseOrder()` is used to sort the list in descending order.
5. **Printing Top 3 Values**: A for loop prints the first three elements of the sorted list. 

This Java code replicates the functionality of the original Python code.