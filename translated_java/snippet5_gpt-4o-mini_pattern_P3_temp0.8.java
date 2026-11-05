Here’s how you can translate the given Python function into Java:

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

        // Sort the array in reverse order
        Arrays.sort(heights, Collections.reverseOrder());

        // Print out the top N10 heights
        for (int i = 0; i < N10; i++) {
            System.out.println(heights[i]);
        }
    }
}
```

### Breakdown of the code:
1. **Imports**: We need to import `Arrays` and `Collections` for sorting.
2. **Array Declaration**: We declare an `Integer[]` array for heights, using the same values as in the Python code.
3. **Sorting**: We use `Arrays.sort()` with `Collections.reverseOrder()` to sort the array in descending order.
4. **Printing**: We loop through the first `N10` elements of the sorted array and print them, using `System.out.println()`. 

This code will produce the same output as the original Python function.