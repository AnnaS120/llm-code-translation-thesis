Sure! Here’s how you can translate the provided Python function into Java:

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
1. **Variable Declaration**: The integers `N1` to `N10` are declared similarly to Python.
2. **Array Initialization**: The `heights` array is initialized using an `Integer` array to allow sorting in reverse order.
3. **Sorting**: `Arrays.sort` is used with `Collections.reverseOrder()` to sort the array in descending order.
4. **Printing**: A simple for loop is used to print the top `N10` heights, similar to how it was done in Python using `join` and `map`. 

You can run this Java code in any Java environment to see the output.