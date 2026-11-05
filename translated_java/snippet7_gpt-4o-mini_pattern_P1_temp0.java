Here’s how you can translate the given Python function into Java:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] mountArray = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        
        // Convert to a list and sort in reverse order
        Arrays.sort(mountArray, Collections.reverseOrder());
        
        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountArray[i]);
        }
    }
}
```

### Explanation:
1. **Array Initialization**: The list of integers is initialized as an array of `Integer` objects.
2. **Sorting**: The `Arrays.sort` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A simple loop prints the first three elements of the sorted array. 

This Java code replicates the functionality of the original Python code.