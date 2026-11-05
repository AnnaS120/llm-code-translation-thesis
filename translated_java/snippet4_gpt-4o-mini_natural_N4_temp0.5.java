Certainly! Below is a valid Java implementation of the provided Python snippet, preserving its original behavior:

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
1. **ArrayList Initialization**: We use `ArrayList<Integer>` to store the integers, similar to the list in Python.
2. **Pop and Append**: The `remove(0)` method is used to mimic `pop(0)` in Python, and `add(a)` appends the value to the end of the list.
3. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: The top three elements are printed using a simple loop.

This Java code will produce the same output as the Python code provided.