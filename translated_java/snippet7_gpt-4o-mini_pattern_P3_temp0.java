Here's the equivalent Java code for the provided Python function:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 95;
        int N2 = 87;
        int N3 = 99;
        int N4 = 55;
        int N5 = 14;
        int N6 = 51;
        int N7 = 69;
        int N8 = 37;
        int N9 = 20;
        int N10 = 3;

        // Create an array with the values
        Integer[] mountArray = {N6, N1, N5, N7, N9, N3, N10, N8, N4, N2};

        // Sort the array in descending order
        Arrays.sort(mountArray, Collections.reverseOrder());

        // Print the top N10 elements
        for (int i = 0; i < N10; i++) {
            System.out.println(mountArray[i]);
        }
    }
}
```

### Explanation:
1. **Array Initialization**: The values are stored in an `Integer` array.
2. **Sorting**: The `Arrays.sort` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A loop is used to print the top `N10` elements from the sorted array. 

Make sure to run this code in a Java environment to see the output.