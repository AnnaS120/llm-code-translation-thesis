Here's a valid Java implementation of the provided Python snippet, preserving the original behavior:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Remove the first element
            m.add(x); // Append it to the end
        }

        Collections.sort(m); // Sort the list
        Collections.reverse(m); // Reverse the list

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **List Creation**: We use `ArrayList` to create a list that holds the integers.
2. **Pop and Append**: The `remove(0)` method removes the first element (similar to `pop(0)` in Python), and `add(x)` appends it to the end of the list.
3. **Sorting and Reversing**: We use `Collections.sort()` to sort the list and `Collections.reverse()` to reverse it.
4. **Printing**: We iterate through the first three elements and print them, similar to the Python `print` function.

This Java code will produce the same output as the original Python snippet.