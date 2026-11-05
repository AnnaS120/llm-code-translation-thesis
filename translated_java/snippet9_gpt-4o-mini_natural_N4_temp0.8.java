Sure! Below is the Java implementation of the provided Python snippet. The Java code aims to replicate the behavior of the original Python code.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        // Populating the height list
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0)); // equivalent to data.pop(0) in Python
        }
        
        // Sorting in reverse order
        Collections.sort(height, Collections.reverseOrder());
        
        // Printing the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:

1. **Data Initialization**: The `data` list is initialized with the same values as in the Python snippet.
2. **Height List**: We create the `height` list by removing elements from the `data` list using `data.remove(0)`, which simulates the `pop(0)` method in Python.
3. **Sorting**: The `Collections.sort()` method is used to sort the list in reverse order, similar to Python's `sorted(..., reverse=True)`.
4. **Output**: The top three sorted heights are printed using a simple loop.

This Java code will produce the same output as the given Python code.