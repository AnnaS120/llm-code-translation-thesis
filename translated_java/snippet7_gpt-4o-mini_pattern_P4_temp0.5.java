Here's the equivalent Java code for the provided Python function:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        Integer[] mountArray = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
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
- **Import Statements**: We import `Arrays`, `Collections`, and `List` to handle array and list operations.
- **Array and List Creation**: We create an array of integers and convert it to a list using `Arrays.asList()`.
- **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
- **Looping and Printing**: We loop through the first three elements of the sorted list and print them. 

This Java code will produce the same output as the Python code.