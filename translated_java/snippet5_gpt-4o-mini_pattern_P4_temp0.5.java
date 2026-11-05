Sure! Below is the equivalent Java code that performs the same operations as the provided Python function:

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
1. **Array Declaration**: The heights are declared as an array of `Integer` objects.
2. **Sorting**: The `Arrays.sort` method with `Collections.reverseOrder()` is used to sort the array in descending order.
3. **Printing**: A simple loop prints the top three heights, similar to the `map` and `join` functionality in Python.