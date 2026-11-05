Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int x = lists.remove(0); // Remove the first element
            lists.add(x); // Add it to the end of the list
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
1. **ArrayList**: We use `ArrayList<Integer>` to store the numbers, similar to a list in Python.
2. **Collections.addAll**: This method is used to initialize the list with the given values.
3. **remove(0)**: This method removes the first element from the list, analogous to `pop(0)` in Python.
4. **add(x)**: This appends the removed element to the end of the list.
5. **Collections.sort()**: This sorts the list in reverse order.
6. **System.out.println()**: This prints the top three elements of the sorted list. 

This Java code replicates the logic of the original Python function.