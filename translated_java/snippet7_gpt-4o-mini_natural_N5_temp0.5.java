Here’s the equivalent Java code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> mountList = Arrays.asList(51, 95, 14, 69, 20, 99, 3, 37, 55, 87);
        
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
- **Import Statements**: Necessary imports for `Arrays`, `Collections`, and `List`.
- **List Creation**: `Arrays.asList()` is used to create a list of integers.
- **Sorting**: `Collections.sort()` sorts the list in reverse order using `Collections.reverseOrder()`.
- **Looping**: A simple for-loop is used to print the first three elements of the sorted list. 

This Java code maintains the functionality of the original Python code.