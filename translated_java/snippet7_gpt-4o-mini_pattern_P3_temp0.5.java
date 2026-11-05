Sure! Below is the equivalent Java code for the provided Python function:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Define the numbers
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

        // Create an array of the numbers
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
1. **Variable Declarations**: The integers `N1` to `N10` are declared and initialized.
2. **Array Creation**: An `Integer[]` array is created with the specified numbers.
3. **Sorting**: The array is sorted in descending order using `Arrays.sort()` with `Collections.reverseOrder()`.
4. **Printing**: A loop is used to print the top `N10` elements from the sorted array. 

You can run this Java code in any Java environment to see the output, which will be the top 3 numbers from the sorted list.