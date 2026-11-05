Here’s how you can translate the provided Python function into Java:

### Java Code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);
        
        for (int i = 0; i < 10; i++) {
            int x = lists.remove(0); // Remove the first element
            lists.add(x); // Append it back to the end
        }
        
        // Sort the list in reverse order
        Collections.sort(lists, Collections.reverseOrder());
        
        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i));
        }
    }
}
```

### Explanation:

1. **Imports**: The necessary classes (`ArrayList`, `Collections`, and `List`) are imported at the beginning.
   
2. **List Initialization**: The list is initialized with the same integers using `Collections.addAll`.

3. **Loop for Reordering**: A loop runs 10 times, where the first element is removed using `remove(0)` and then added back to the end of the list with `add(x)`.

4. **Sorting**: The list is sorted in reverse order using `Collections.sort` with `Collections.reverseOrder()`.

5. **Printing the Top 3**: Finally, the first three elements from the sorted list are printed using a simple loop and `System.out.println`. 

This Java code replicates the functionality of the provided Python script.