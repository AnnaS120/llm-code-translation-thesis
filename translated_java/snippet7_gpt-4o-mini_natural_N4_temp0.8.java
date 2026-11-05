Here's a valid Java implementation of the given Python snippet that preserves its original behavior. The Java code will create a list of integers, sort it in descending order, and print the top three values.

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> mountList = Arrays.asList(51, 95, 14, 69, 20, 99, 3, 37, 55, 87);
        
        // Sort the list in descending order
        Collections.sort(mountList, Collections.reverseOrder());
        
        // Print the top three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

### Explanation:
1. **List Creation**: The list is created using `Arrays.asList()` which allows us to initialize it with the given integers.
2. **Sorting**: `Collections.sort()` is used to sort the list in descending order by passing `Collections.reverseOrder()` as a comparator.
3. **Printing**: A simple for-loop iterates through the first three elements of the sorted list and prints each one.

### Output:
When you run this Java program, it will produce the same output as the original Python snippet, which are the top three values from the sorted list in descending order.