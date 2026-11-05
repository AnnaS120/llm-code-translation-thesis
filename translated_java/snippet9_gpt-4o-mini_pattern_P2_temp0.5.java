Here’s how you can translate the given Python function into Java:

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
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0)); // Remove the first element and add it to height
        }
        
        // Sorting the height list in reverse order
        Collections.sort(height, Collections.reverseOrder());
        
        // Printing the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import necessary classes from the `java.util` package.
2. **List Initialization**: We create an `ArrayList` to hold the data.
3. **Populating the `height` List**: We use a loop to remove the first element from `data` and add it to `height`.
4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the heights in descending order.
5. **Printing**: Finally, we loop through the first three elements of the sorted list and print them.