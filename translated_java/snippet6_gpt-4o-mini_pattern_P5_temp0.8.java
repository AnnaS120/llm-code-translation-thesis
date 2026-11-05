Certainly! Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the list
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        // Perform the operation of popping the first element and appending it
        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element
            list.add(t);            // Add it to the end
        }

        // Sort the list in reverse order
        Collections.sort(list, Collections.reverseOrder());

        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
```

### Explanation:

1. **Imports**: We import `ArrayList` for the list structure and `Collections` for sorting.
2. **List Initialization**: We use `Collections.addAll` to initialize the list with the given integers.
3. **Looping**: In the for loop, we use `list.remove(0)` to pop the first element and then `list.add(t)` to append it to the end.
4. **Sorting**: We sort the list in reverse order using `Collections.sort`.
5. **Printing**: Finally, we print the first three elements using a simple loop.

This Java function mimics the behavior of the original Python function.