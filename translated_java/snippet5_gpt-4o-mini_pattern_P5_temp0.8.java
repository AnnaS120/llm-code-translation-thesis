Here's how you can translate the given Python function into Java:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        
        // Convert array to list for sorting
        List<Integer> heightList = Arrays.asList(heights);
        
        // Sort the list in descending order
        Collections.sort(heightList, Collections.reverseOrder());
        
        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(heightList.get(i));
        }
    }
}
```

### Explanation:
1. **Array Initialization**: We define an `Integer` array for the heights.
2. **List Creation**: Convert the array to a List for easier sorting.
3. **Sorting**: Use `Collections.sort` with `Collections.reverseOrder()` to sort in descending order.
4. **Printing**: Loop through the first three elements of the sorted list to print them.

This Java code replicates the functionality of the original Python code.