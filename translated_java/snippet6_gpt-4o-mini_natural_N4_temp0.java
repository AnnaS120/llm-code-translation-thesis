Here’s a valid Java implementation of the provided Python snippet, preserving the original behavior:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element
            list.add(t); // Append it to the end
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **List Initialization**: We use `ArrayList` to create a list and populate it with the initial values.
2. **Loop for Pop and Append**: The loop removes the first element and appends it to the end of the list, similar to the Python `pop(0)` and `append()`.
3. **Sorting**: We sort the list in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
4. **Printing**: Finally, we print the first three elements of the sorted list.

This Java code will produce the same output as the original Python code.