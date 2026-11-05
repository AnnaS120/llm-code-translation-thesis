Here's the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        // Create a height list and populate it
        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0)); // Remove the first element and add to height
        }
        
        // Sort the height list in reverse order
        Collections.sort(height, Collections.reverseOrder());
        
        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:

1. **Imports**: We import `ArrayList` and `Collections` to use dynamic arrays and sorting methods.
2. **Data Initialization**: We initialize the `data` list using `Collections.addAll()` to mimic the list in Python.
3. **Populating `height`**: We loop 10 times, removing the first element from `data` and adding it to `height`.
4. **Sorting**: We sort the `height` list in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing**: We print the first three elements of the sorted list. 

This Java code accomplishes the same task as the provided Python function.