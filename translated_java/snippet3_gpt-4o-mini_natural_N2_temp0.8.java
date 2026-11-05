Here’s the equivalent Java code for the provided Python script:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0));
        }
        
        Collections.sort(ans, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` and `Collections` for list manipulation and sorting.
2. **Initialization**: An `ArrayList<Integer>` is created and initialized with the same values as in the Python list.
3. **Loop**: A for loop runs 10 times, removing the first element (using `remove(0)`) and appending it back to the end of the list.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()`.
5. **Output**: A second for loop prints the first three elements of the sorted list.

### Note:
- In Java, `ArrayList` is used instead of Python's built-in list.
- The `remove(0)` method in `ArrayList` removes the element at the specified index (here, the first element).
- `Collections.sort()` is utilized to sort the list in reverse order.