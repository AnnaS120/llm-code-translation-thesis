Certainly! Below is the equivalent Java code for the provided Python snippet:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        
        // Sort heights in descending order
        Arrays.sort(heights, Collections.reverseOrder());
        
        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
    }
}
```

### Explanation:
- **Imports**: We import `Arrays` and `Collections` to enable sorting.
- **Array Initialization**: The `heights` array is initialized with the same values as in the Python list.
- **Sorting**: We use `Arrays.sort()` with `Collections.reverseOrder()` to sort the array in descending order.
- **Printing**: Instead of `map` and `join`, we simply use a loop to print the top 3 heights directly.