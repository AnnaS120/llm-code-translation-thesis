Here is the equivalent Java code for the provided Python code:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        
        // Convert to a list and sort in reverse order
        Arrays.sort(mountList, Collections.reverseOrder());
        
        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList[i]);
        }
    }
}
```

### Explanation:
1. **Array Initialization**: The `mount_list` in Python is initialized as a list of integers. In Java, we use an `Integer[]` array.
2. **Sorting**: The `sort` method in Python is replaced with `Arrays.sort` in Java, using `Collections.reverseOrder()` to sort in descending order.
3. **Looping and Printing**: The loop iterates through the first three elements of the sorted array, printing each one.