Here’s the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        // Create a height list and populate it by removing elements from data
        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));
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
1. **Data Structure**: The `ArrayList` is used in Java to mimic Python's list.
2. **Populating the List**: The `remove(0)` method is used to simulate the `pop(0)` method in Python, which removes the first element.
3. **Sorting**: The `Collections.sort()` method is used to sort the list in reverse order.
4. **Printing**: The `System.out.println()` method is used to print the top three heights. 

This Java code maintains the same logic and structure as the original Python code.