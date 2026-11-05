Below is a valid Java implementation of the provided Python snippet. The Java code preserves the original behavior, which involves manipulating a list (array) of integers, rotating its elements, sorting it in descending order, and then printing the top three values.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the list with the given integers
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Rotate elements 10 times
        for (int i = 0; i < 10; i++) {
            // Remove the first element and add it to the end
            int firstElement = ans.remove(0);
            ans.add(firstElement);
        }

        // Sort the list in descending order
        Collections.sort(ans, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **Import Statements**: The `ArrayList` class and `Collections` class are imported to manage the list and perform sorting.
2. **Initialization**: The list `ans` is initialized with the given integers using `Collections.addAll()`.
3. **Rotation Logic**: A loop is used to perform the rotation operation ten times, where the first element is removed and added to the end of the list.
4. **Sorting**: The list is sorted in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Output**: The top three elements are printed by iterating through the first three indices of the sorted list.