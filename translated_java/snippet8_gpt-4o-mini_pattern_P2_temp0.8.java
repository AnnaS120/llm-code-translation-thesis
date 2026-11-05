Here's the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int idx = 0; idx < 10; idx++) {
            int x = m.remove(0); // Remove the first element and get its value
            m.add(x); // Append it to the end
        }

        Collections.sort(m); // Sort the list
        Collections.reverse(m); // Reverse the list

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(m.get(idx)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used to hold the integer values similar to Python's list.
2. **Collections.addAll**: To initialize the list with values.
3. **remove(0)**: Removes the first element, similar to Python's `pop(0)`.
4. **add(x)**: Adds the element back at the end of the list.
5. **Collections.sort()**: Sorts the list in ascending order.
6. **Collections.reverse()**: Reverses the order of the list.
7. **System.out.println()**: Prints the first three elements of the modified list.