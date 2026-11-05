Here’s how you can translate the provided Python function into Java:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 71;
        int N2 = 43;
        int N3 = 63;
        int N4 = 60;
        int N5 = 35;
        int N6 = 10;
        int N7 = 24;
        int N8 = 74;
        int N9 = 32;
        int N10 = 53;
        int N11 = 0;
        int N12 = 7;
        int N13 = 3;

        Integer[] data = {N8, N2, N4, N10, N7, N5, N3, N9, N12, N1};
        Integer[] height = new Integer[N6];

        // Populating the height array
        for (int i = 0; i < N6; i++) {
            height[i] = data[N11];
            // Remove the element at index N11 for the next iterations
            data[N11] = null; // Mark as null
            // Find the next non-null element
            for (int j = 0; j < data.length; j++) {
                if (data[j] != null) {
                    N11 = j; // Update N11 to the next non-null index
                    break;
                }
            }
        }
        
        // Sorting the array in reverse order
        Arrays.sort(height, Collections.reverseOrder());

        // Printing the first N13 elements
        for (int i = 0; i < N13; i++) {
            System.out.println(height[i]);
        }
    }
}
```

### Explanation:

1. **Initialization of Variables**: The integers `N1` to `N13` are initialized.
2. **Data Array**: An array `data` is created containing the values.
3. **Height Array**: A height array of size `N6` is initialized to store values.
4. **Populating Height**: A loop fills the `height` array by popping values from the `data` array. The popped value is set to `null` to simulate the `pop` operation, and `N11` is updated to the next non-null index.
5. **Sorting**: The `height` array is sorted in reverse order using `Arrays.sort()` with `Collections.reverseOrder()`.
6. **Printing**: The first `N13` elements of the sorted array are printed.

### Note:
This code assumes that the number of items in `data` is greater than or equal to `N6` and that `N13` is less than or equal to `N6` to avoid `ArrayIndexOutOfBoundsException`.