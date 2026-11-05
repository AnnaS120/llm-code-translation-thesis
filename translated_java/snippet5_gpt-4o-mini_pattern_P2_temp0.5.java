Sure! Here's the equivalent Java code for the given Python function:

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
1. **Array Declaration**: We declare an `Integer[]` array to hold the heights.
2. **Sorting**: We use `Arrays.sort()` with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: We loop through the first three elements of the sorted array and print each height. 

This Java code replicates the functionality of the Python code you provided.