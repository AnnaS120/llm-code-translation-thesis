To translate the given Python snippet into Java while preserving the original behavior, you can follow the steps below. The code initializes an array of heights, sorts it in descending order, and prints the top three heights, each on a new line.

Here’s a valid Java implementation:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};

        // Sort the array in descending order
        Arrays.sort(heights, Collections.reverseOrder());

        // Print the top three heights, each on a new line
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
    }
}
```

### Breakdown of the Code:
1. **Imports**: `Arrays` and `Collections` are imported to use the sorting functionality.
2. **Height Array**: An `Integer` array is initialized with the heights.
3. **Sorting**: `Arrays.sort()` is used with `Collections.reverseOrder()` to sort the array in descending order.
4. **Printing**: A loop is used to print the top three heights, each on a new line.

### Execution:
When you run this Java code, it will output the three highest heights from the initial list, matching the behavior of the original Python snippet.