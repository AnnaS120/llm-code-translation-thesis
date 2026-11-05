Sure! Here’s a valid Java implementation that preserves the original behavior of the provided Python snippet:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Remove the first element and get its value
            m.add(x);             // Append the value to the end of the list
        }

        Collections.sort(m); // Sort the list
        Collections.reverse(m); // Reverse the sorted list

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList` to mimic the dynamic array behavior of Python's list.
2. **Collections.addAll()**: This is used to initialize the list with the given values.
3. **m.remove(0)**: This removes and returns the first element, similar to `m.pop(0)` in Python.
4. **m.add(x)**: This appends the element to the end of the list.
5. **Collections.sort()**: Sorts the list in ascending order.
6. **Collections.reverse()**: Reverses the sorted list to get it in descending order.
7. **System.out.println()**: Prints the first three elements of the reversed list.

This Java code will produce the same output as the original Python snippet.