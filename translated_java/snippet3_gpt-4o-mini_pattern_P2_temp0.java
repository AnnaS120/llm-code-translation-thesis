Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        for (int idx = 0; idx < 10; idx++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(ans, Collections.reverseOrder()); // Sort in descending order

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(ans.get(idx)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with values.
3. **Looping**: The `for` loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the first three elements of the sorted list. 

This Java code replicates the functionality of the original Python code.