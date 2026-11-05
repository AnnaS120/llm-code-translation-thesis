Here’s a valid Java implementation of the provided Python snippet. The Java code preserves the original behavior, which involves manipulating a list of integers, sorting them in descending order, and printing the top three values.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        List<Integer> height = new ArrayList<>();
        
        // Populating the height list by removing elements from data
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));
        }
        
        // Sorting the height list in descending order
        Collections.sort(height, Collections.reverseOrder());
        
        // Printing the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Data Initialization**: The `data` list is initialized with the same values as in the Python code.
2. **Height List Creation**: A loop is used to remove elements from `data` and add them to `height`, mimicking the `pop(0)` behavior in Python.
3. **Sorting**: The `Collections.sort()` method is used to sort the `height` list in descending order.
4. **Printing**: A loop prints the top three elements from the sorted list.

This Java code will produce the same output as the original Python snippet.