Sure! Below is the equivalent Java method that sorts an array of heights in descending order and prints the top three heights:

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
1. **Array Declaration**: The heights are declared as an `Integer[]` array since Java arrays do not have a built-in sort method for primitive types like `int`.
2. **Sorting**: The `Arrays.sort` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A simple loop prints the top three heights to the console.