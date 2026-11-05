Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        List<Integer> height = new ArrayList<>();
        
        // Populating the height list
        for (int idx = 0; idx < 10; idx++) {
            height.add(data.remove(0));
        }
        
        // Sorting the height list in reverse order
        Collections.sort(height, Collections.reverseOrder());
        
        // Printing the top 3 heights
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(height.get(idx));
        }
    }
}
```

### Explanation:
1. **List Initialization**: We use `ArrayList` to store the data.
2. **Populating the Height List**: We remove elements from the `data` list and add them to the `height` list.
3. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: We print the top three elements from the sorted list. 

This Java code replicates the functionality of the original Python code.