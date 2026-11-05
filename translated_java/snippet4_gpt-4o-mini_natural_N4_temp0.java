Here’s a valid Java implementation of the provided Python snippet, preserving the original behavior:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Remove the first element
            lists.add(a); // Append it to the end
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
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Collections.addAll**: This method is used to initialize the list with the given integers.
3. **Loop**: The loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: We use `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the first three elements of the sorted list.

This Java code will produce the same output as the original Python code.