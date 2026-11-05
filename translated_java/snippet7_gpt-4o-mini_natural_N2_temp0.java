Here’s the equivalent Java code for the provided Python code:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};

        // Sort the array in descending order
        Arrays.sort(mountList, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList[i]);
        }
    }
}
```

### Explanation:
1. **Array Initialization**: The list of integers is initialized as an `Integer` array.
2. **Sorting**: The `Arrays.sort` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A loop is used to print the first three elements of the sorted array. 

This Java code maintains the same logic and structure as the original Python code.