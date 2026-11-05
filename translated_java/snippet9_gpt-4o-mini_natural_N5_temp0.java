Here's the equivalent Java code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        // Create a list to hold the heights
        ArrayList<Integer> height = new ArrayList<>();
        
        // Pop the first element and add it to the height list
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));
        }
        
        // Sort the heights in descending order
        Collections.sort(height, Collections.reverseOrder());
        
        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` and `Collections` for list manipulation and sorting.
2. **Data Initialization**: We initialize the `data` list using `Collections.addAll()`.
3. **Height List**: We create an `ArrayList<Integer>` for `height` and populate it by removing elements from `data`.
4. **Sorting**: We sort the `height` list in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Output**: We print the top three heights using a loop.

This Java code mirrors the functionality of the original Python code while adhering to Java's syntax and conventions.