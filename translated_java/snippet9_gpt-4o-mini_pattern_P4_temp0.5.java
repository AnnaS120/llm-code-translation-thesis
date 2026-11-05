Here's how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        List<Integer> height = new ArrayList<>();
        
        // Extracting the first 10 elements from data
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
1. **List Initialization**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Data Population**: `Collections.addAll` is used to populate the list.
3. **Removing Elements**: The `remove(0)` method is used to pop elements from the front of the list, similar to `data.pop(0)` in Python.
4. **Sorting**: `Collections.sort` with `Collections.reverseOrder()` sorts the list in descending order.
5. **Printing**: The top three elements are printed using a simple loop.

This Java code replicates the functionality of the original Python code while adhering to Java syntax and conventions.