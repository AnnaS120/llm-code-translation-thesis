Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int idx = 0; idx < 10; idx++) {
            int x = m.remove(0); // Remove the first element
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
1. **ArrayList**: Used to mimic the dynamic list behavior of Python's list.
2. **Collections.addAll()**: Used to initialize the list with values.
3. **remove(0)**: Removes the first element of the list and returns it.
4. **add(x)**: Appends the removed element to the end of the list.
5. **Collections.sort()**: Sorts the list in ascending order.
6. **Collections.reverse()**: Reverses the order of the list.
7. **System.out.println()**: Prints the first three elements of the list.

This Java code replicates the functionality of the provided Python code.