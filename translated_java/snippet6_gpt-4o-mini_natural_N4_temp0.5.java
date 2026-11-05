Here's a valid Java implementation of the provided Python snippet while preserving its original behavior:

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

        Collections.sort(list, Collections.reverseOrder()); // Sort the list in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:

1. **List Initialization**: We use `ArrayList` and `Collections.addAll` to initialize the list with the same values as in the Python code.

2. **Loop for Manipulation**: The loop iterates 10 times, removing the first element (using `remove(0)`) and appending it to the end of the list.

3. **Sorting**: The list is sorted in descending order using `Collections.sort` with `Collections.reverseOrder()`.

4. **Output**: Finally, the first three elements of the sorted list are printed using `System.out.println`.

This Java code maintains the same logic and functionality as your original Python snippet.