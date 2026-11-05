Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element
            list.add(t); // Append it to the end
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
- **ArrayList**: Used instead of Python's list for dynamic array behavior.
- **Collections.addAll**: Used to initialize the list with values.
- **remove(0)**: Equivalent to `pop(0)` in Python, removes the first element.
- **add(t)**: Appends the removed element to the end of the list.
- **Collections.sort**: Sorts the list in reverse order.
- **get(i)**: Accesses elements in the list, similar to indexing in Python.