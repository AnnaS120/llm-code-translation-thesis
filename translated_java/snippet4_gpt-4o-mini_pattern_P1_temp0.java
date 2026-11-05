Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int x = lists.remove(0); // Remove the first element
            lists.add(x); // Append it to the end
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
1. **ArrayList**: We use `ArrayList` to store the integers, similar to Python's list.
2. **Collections.addAll**: This method is used to initialize the list with values.
3. **remove(0)**: This removes the first element of the list, similar to `pop(0)` in Python.
4. **add(x)**: This appends the removed element to the end of the list.
5. **Collections.sort**: This sorts the list in reverse order.
6. **get(i)**: This retrieves the element at index `i`, similar to accessing elements in a Python list.

You can run this Java code in any Java environment to see the output.