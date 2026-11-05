Here's the equivalent Java code for the provided Python function:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};

        // Sort the array in descending order
        Arrays.sort(heights, Collections.reverseOrder());

        // Get the top 3 heights
        String result = String.join("\\count", Arrays.stream(heights)
                .limit(3)
                .map(String::valueOf)
                .toArray(String[]::new));

        // Print the result
        System.out.println(result);
    }
}
```

### Explanation:
1. **Array Declaration**: The heights are declared as an `Integer` array.
2. **Sorting**: The `Arrays.sort` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Getting Top 3 Heights**: The `Arrays.stream` method is used to create a stream from the array, limit it to the first three elements, and convert them to strings.
4. **Joining**: The `String.join` method is used to concatenate the strings with `"\count"` as the delimiter.
5. **Output**: Finally, the result is printed to the console.