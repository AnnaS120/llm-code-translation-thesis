Here's the equivalent Java code for the provided Python function:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] mountArray = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        
        // Convert the array to a list
        List<Integer> mountList = Arrays.asList(mountArray);
        
        // Sort the list in descending order
        Collections.sort(mountList, Collections.reverseOrder());
        
        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

### Explanation:
1. **Array Initialization**: The array `mountArray` is initialized with the same values as in the Python list.
2. **Conversion to List**: The array is converted to a list using `Arrays.asList()`.
3. **Sorting**: The list is sorted in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
4. **Printing Top 3 Elements**: A loop iterates through the first three elements of the sorted list and prints them. 

You can run this Java code in any Java environment to see the output.