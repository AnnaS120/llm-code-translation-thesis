Here's how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);
        
        // Rotate the list 10 times
        for (int i = 0; i < 10; i++) {
            // Remove the first element and append it to the end
            ans.add(ans.remove(0));
        }
        
        // Sort the list in descending order
        Collections.sort(ans, Collections.reverseOrder());
        
        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:

1. **ArrayList Initialization**: We use `ArrayList<Integer>` to store the integer values, similar to the list in Python.

2. **Adding Elements**: We utilize `Collections.addAll()` to add initial elements to the `ArrayList`.

3. **Rotation**: The loop iterates 10 times, where each time it removes the first element using `remove(0)` and appends it to the end using `add()`.

4. **Sorting**: The `Collections.sort()` method is used with `Collections.reverseOrder()` to sort the list in descending order.

5. **Printing the Top 3 Values**: A loop prints the first three elements of the sorted list.

This Java code replicates the functionality of the original Python code.