Here’s the Python function translated into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        
        // Initialize the data list
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        // Create the height list by removing the first element from data
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0)); // pop(0) in Python
        }
        
        // Sort the height list in descending order
        Collections.sort(height, Collections.reverseOrder());
        
        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Breakdown:

1. **List Initialization:** We create an `ArrayList<Integer>` to store the data, similar to the Python list.

2. **Populating Height:** We remove the first element from the `data` list and add it to the `height` list in a loop.

3. **Sorting:** We use `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.

4. **Printing:** Finally, we print the first three elements of the sorted list. 

### Important Note:
Java lists do not have a built-in `pop` method like Python, so we achieve the popping effect by using `data.remove(0)`.