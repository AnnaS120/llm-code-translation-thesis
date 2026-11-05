Certainly! Below is a valid Java implementation of the provided Python snippet. The Java code sorts an array of heights in descending order and then prints the top three heights.

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};

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
1. **Array Declaration**: The heights are stored in an `Integer[]` array.
2. **Sorting**: The `Arrays.sort()` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A loop iterates through the first three elements of the sorted array, printing each height on a new line.

You can run this Java code in any Java environment, and it will produce the same output as the original Python snippet.