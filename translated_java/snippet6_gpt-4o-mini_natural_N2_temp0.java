Here’s the equivalent Java code for the provided Python code:

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
1. **ArrayList**: Used to create a dynamic array similar to Python's list.
2. **Collections.addAll**: Used to initialize the list with values.
3. **remove(0)**: Removes the first element of the list, similar to `pop(0)` in Python.
4. **add(t)**: Appends the removed element to the end of the list.
5. **Collections.sort**: Sorts the list in descending order.
6. **get(i)**: Retrieves elements from the list, similar to indexing in Python. 

This Java code maintains the same logic and structure as the original Python code.