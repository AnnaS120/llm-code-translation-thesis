Here's the equivalent Java code for the provided Python function:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 65;
        int N2 = 40;
        int N3 = 75;
        int N4 = 46;
        int N5 = 17;
        int N6 = 25;
        int N7 = 30;
        int N8 = 69;
        int N9 = 4;
        int N10 = 3;

        Integer[] heights = {N8, N2, N6, N5, N2, N7, N1, N3, N4, N9};

        // Sort the array in descending order
        Arrays.sort(heights, Collections.reverseOrder());

        // Print the top N10 heights
        for (int i = 0; i < N10; i++) {
            System.out.println(heights[i]);
        }
    }
}
```

### Explanation:
1. **Array Declaration**: The heights are stored in an `Integer[]` array.
2. **Sorting**: The `Arrays.sort()` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A simple loop is used to print the top `N10` heights.