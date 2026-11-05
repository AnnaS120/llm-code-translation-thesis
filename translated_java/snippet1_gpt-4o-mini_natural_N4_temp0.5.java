Here’s a valid Java implementation of the provided Python snippet, preserving the original behavior:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Perform the pop and append operation
        for (int i = 0; i < 10; i++) {
            // Remove the first element and append it to the end of the list
            int firstElement = arr.remove(0);
            arr.add(firstElement);
        }

        // Sort the list in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:

1. **ArrayList Initialization**: We use `ArrayList<Integer>` to hold the integers, similar to the Python list.
2. **Adding Elements**: We use `Collections.addAll()` to populate the list with the initial values.
3. **Loop for Pop and Append**: We use a loop to remove the first element (using `remove(0)`) and append it to the end (using `add()`).
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing Elements**: Finally, we print the first three elements of the sorted list using `System.out.println()`.

This Java code will produce the same output as the original Python code.