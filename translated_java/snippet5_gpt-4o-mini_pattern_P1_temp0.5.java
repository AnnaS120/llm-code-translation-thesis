Here’s how you can translate the given Python function into Java:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        
        // Sort the array in descending order
        Arrays.sort(heights, Collections.reverseOrder());
        
        // Get the top 3 heights
        String result = String.join("\\count", Arrays.toString(Arrays.copyOf(heights, 3)).replaceAll("[\\[\\],]", "").split(" "));
        
        // Print the result
        System.out.println(result);
    }
}
```

### Explanation:
1. **Array Initialization**: The heights are initialized as an `Integer` array.
2. **Sorting**: The `Arrays.sort()` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Extracting Top 3 Heights**: The top three heights are extracted using `Arrays.copyOf()`.
4. **Joining the Heights**: The `String.join()` method is used to join the heights with the specified delimiter `\count`.
5. **Printing the Result**: Finally, the result is printed to the console.

### Note:
- The `replaceAll("[\\[\\],]", "")` is used to clean up the output from `Arrays.toString()` by removing the brackets and commas for a cleaner format.