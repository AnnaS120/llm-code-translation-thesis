Here’s the translation of the provided Python function into Java:

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
            height.add(data.remove(0));  // Remove the first element and add to height
        }

        // Sort the height list in descending order
        Collections.sort(height, Collections.reverseOrder());

        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Import Statements**: We import necessary classes from the Java Collections framework.
2. **Data Initialization**: We initialize the `data` list using `Collections.addAll()`.
3. **Height List Creation**: We use a loop to remove the first element from `data` and add it to `height`, mimicking the behavior of `pop(0)` in Python.
4. **Sorting**: We sort the `height` list in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing**: Finally, we loop through the first three elements of the sorted list and print them, similar to the original Python code.