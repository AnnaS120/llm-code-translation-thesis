Here’s how you can translate the provided Python function into Java:

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
1. **Array Declaration**: We declare an `Integer` array instead of a Python list.
2. **Sorting**: We use `Arrays.sort` with `Collections.reverseOrder()` to sort the array in descending order.
3. **Output**: We loop through the first three elements of the sorted array and print each height on a new line. 

Make sure to run this code in a Java environment to see the output!