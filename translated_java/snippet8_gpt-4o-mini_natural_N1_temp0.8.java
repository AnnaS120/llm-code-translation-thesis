Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            // Remove the first element and add it to the end
            int x = m.remove(0);
            m.add(x);
        }

        // Sort the list
        Collections.sort(m);
        // Reverse the list
        Collections.reverse(m);

        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i));
        }
    }
}
```

### Explanation:

1. **ArrayList**: In Java, you can use `ArrayList` to manage a dynamic array like the Python list.
2. **Collections.addAll**: This initializes the `ArrayList` with the given elements.
3. **remove(0)**: This method removes the first element of the list and returns it.
4. **add(x)**: This appends the removed element back to the end of the list.
5. **Collections.sort()**: Sorts the list in ascending order.
6. **Collections.reverse()**: Reverses the order of the list.
7. **System.out.println()**: Prints the first three elements of the list.