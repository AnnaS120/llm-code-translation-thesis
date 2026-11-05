Here's the translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element and store it in t
            list.add(t); // Append t to the end of the list
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in reverse order

        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
```

### Explanation:
1. **List Initialization**: I used `ArrayList` to mimic Python's list behavior.
2. **Removing and Adding Elements**: The `remove(0)` method removes the first element, similar to `pop(0)` in Python, and `add(t)` appends `t` to the end of the list.
3. **Sorting the List**: `Collections.sort(list, Collections.reverseOrder())` sorts the list in descending order.
4. **Printing Elements**: A loop prints the first three elements of the sorted list.