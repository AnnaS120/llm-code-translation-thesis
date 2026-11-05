Here's how you can translate the provided Python function into Java:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        
        // Sort the array in descending order
        Arrays.sort(heights, Collections.reverseOrder());

        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
    }
}
```

### Explanation:
1. **Import Statements**: We import `Arrays` for sorting and `Collections` for reverse ordering.
2. **Integer Array**: The heights are stored in an `Integer` array.
3. **Sorting**: `Arrays.sort()` is used with `Collections.reverseOrder()` to sort the array in descending order.
4. **Printing**: A loop is used to print the top 3 heights. Each height is printed on a new line.