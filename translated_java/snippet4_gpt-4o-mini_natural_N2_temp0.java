Here’s the equivalent Java code for the provided Python code:

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
1. **ArrayList**: Used to store the list of integers, similar to Python's list.
2. **Collections.addAll**: Used to initialize the list with values.
3. **remove(0)**: Equivalent to `pop(0)` in Python, which removes the first element.
4. **add(a)**: Appends the removed element to the end of the list.
5. **Collections.sort**: Sorts the list in reverse order.
6. **get(i)**: Retrieves the element at index `i`, similar to accessing elements in a Python list. 

This Java code maintains the same logic and structure as the original Python code.