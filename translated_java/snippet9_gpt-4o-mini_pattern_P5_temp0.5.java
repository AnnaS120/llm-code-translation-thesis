Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the data list
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);

        // Create the height list and populate it by removing elements from data
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));
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
1. **Imports**: We import necessary classes from the Java Collections Framework.
2. **Data Initialization**: We initialize the `data` list using `Collections.addAll`.
3. **Populating Height**: We create a `height` list and fill it by removing elements from `data` in a loop.
4. **Sorting**: We sort the `height` list in descending order using `Collections.sort` with `Collections.reverseOrder`.
5. **Printing**: Finally, we print the top 3 elements from the sorted list.

This Java code replicates the functionality of the original Python code while adhering to Java syntax and conventions.