Here's the equivalent Java code for the given Python function:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};

        // Convert the array to a list and sort it in reverse order
        Arrays.sort(mountList, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList[i]);
        }
    }
}
```

### Explanation:
1. **Array Declaration**: The `mountList` is declared as an `Integer` array containing the same values as the original Python list.
2. **Sorting**: `Arrays.sort` is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A simple loop prints the first three elements of the sorted array.