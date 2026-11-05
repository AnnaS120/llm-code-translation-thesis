Here’s a Java implementation of the provided Python snippet that preserves the original behavior:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] mountArray = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};

        // Convert the array to a List
        List<Integer> mountList = Arrays.asList(mountArray);

        // Sort the list in reverse order
        Collections.sort(mountList, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

### Explanation:
1. **Array Initialization**: We initialize an array of integers similar to the Python list.
2. **Conversion to List**: We convert the array to a `List` using `Arrays.asList()`.
3. **Sorting**: We sort the list in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
4. **Printing**: We loop through the first three elements of the sorted list and print them.

This Java code will produce the same output as the original Python snippet.