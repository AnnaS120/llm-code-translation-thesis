Here’s the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
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
1. **ArrayList**: Used to store the integers, similar to Python's list.
2. **Collections.addAll**: Used to initialize the list with values.
3. **remove(0)**: Equivalent to `pop(0)` in Python, which removes the first element.
4. **add(x)**: Appends the element to the end of the list.
5. **Collections.sort()**: Sorts the list in ascending order.
6. **Collections.reverse()**: Reverses the order of the list.
7. **System.out.println()**: Used to print the elements, similar to Python's `print()` function. 

This Java code maintains the same logic and structure as the original Python code.