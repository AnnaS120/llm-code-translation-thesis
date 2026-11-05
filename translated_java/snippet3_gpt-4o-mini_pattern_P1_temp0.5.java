Sure! Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(ans, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: In Java, we use `ArrayList` to dynamically manage the list of integers.
2. **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
3. **Removing and Adding Elements**: The `remove(0)` method removes the first element, and we immediately add it back to the end of the list.
4. **Sorting**: `Collections.sort` with `Collections.reverseOrder()` is used to sort the list in descending order.
5. **Printing Elements**: We use `System.out.println` to print the first three elements.

This Java implementation closely follows the logic of the original Python code.