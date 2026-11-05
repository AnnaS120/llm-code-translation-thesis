Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Loop iteration
        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        // Sort in reverse order
        Collections.sort(ans, Collections.reverseOrder());

        // Loop iteration to print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with values.
3. **Looping and Modifying the List**: In the loop, `ans.remove(0)` removes the first element and `ans.add(...)` appends it to the end.
4. **Sorting**: `Collections.sort()` is used to sort the list in reverse order.
5. **Printing Elements**: Finally, we print the first three elements of the sorted list.