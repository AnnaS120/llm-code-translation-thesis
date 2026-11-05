Here’s the translation of the provided Python function into Java:

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
1. **Array Declaration**: In Python, you use a list, while in Java, we use an array. The heights are declared as an array of `Integer` objects.
2. **Sorting**: The `Arrays.sort()` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A loop is used to print the first three elements from the sorted array, ensuring each height is printed on a new line.