Certainly! Below is a valid Java implementation of the provided Python snippet. This Java code preserves the original behavior, including the list manipulation and sorting.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);

        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0)); // Pop the first element
        }

        List<Integer> sort = new ArrayList<>(height);
        Collections.sort(sort, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(sort.get(i)); // Print the top 3 heights
        }
    }
}
```

### Explanation:
1. **Initialization**: We use an `ArrayList` to hold the initial `data` values.
2. **Pop Operation**: The `data.remove(0)` method is used to mimic the `pop(0)` operation from Python, which removes the first element from the list.
3. **Sorting**: We create a copy of the `height` list and sort it in descending order using `Collections.sort()`.
4. **Printing**: Finally, we print the top three elements from the sorted list.

### Running the Code:
You can run this Java code in any Java development environment or online compiler that supports Java. It will output the three tallest heights from the original list, just like the Python code.