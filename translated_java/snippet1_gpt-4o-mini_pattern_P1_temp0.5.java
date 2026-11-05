Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Simulating the Python loop that pops the first element and appends it to the end
        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0)); // remove(0) pops the first element
        }

        // Sorting the array in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Printing the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to Python's list.
2. **Collections.addAll**: This method is used to initialize the list with the given integers.
3. **Loop for shifting elements**: The loop `for (int i = 0; i < 10; i++)` simulates the `pop(0)` and `append` operations from Python. The `remove(0)` method removes the first element, and `add()` appends it to the end.
4. **Sorting**: `Collections.sort(arr, Collections.reverseOrder())` sorts the list in descending order.
5. **Printing**: Finally, we print the first three elements using `System.out.println()`.