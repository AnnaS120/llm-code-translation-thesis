Here’s how you can rewrite the provided Python function as a Java method, following correct Java syntax and conventions:

```java
import java.util.Arrays;
import java.util.Collections;

public class HeightSorter {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        printTopThreeHeights(heights);
    }

    public static void printTopThreeHeights(Integer[] heights) {
        // Sort the array in descending order
        Arrays.sort(heights, Collections.reverseOrder());

        // Print the top three heights
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
    }
}
```

### Explanation:
1. **Imports**: We import `Arrays` and `Collections` for sorting.
2. **Main Method**: The `main` method initializes the heights array and calls the `printTopThreeHeights` method.
3. **Sorting**: We use `Arrays.sort` with `Collections.reverseOrder()` to sort the array in descending order.
4. **Printing**: A simple loop prints the top three heights.