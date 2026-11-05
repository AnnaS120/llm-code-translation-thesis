Sure! Here’s the translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Rotate the array 10 times
        for (int idx = 0; idx < 10; idx++) {
            arr.add(arr.remove(0)); // Remove the first element and add it to the end
        }

        // Sort the array in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the first 3 elements
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(arr.get(idx));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList` in Java since it is dynamic and allows for easy manipulation of elements.
2. **Collections.addAll**: This is used to initialize the `ArrayList` with the given elements.
3. **Rotation**: The `remove(0)` method removes the first element, and `add()` appends it to the end of the list.
4. **Sorting**: `Collections.sort(arr, Collections.reverseOrder())` sorts the list in descending order.
5. **Printing**: The loop prints the first three elements of the sorted list. 

You can run this code in any Java environment to see the output.