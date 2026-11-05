Here's the equivalent Java code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Rotate the array 10 times
        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0)); // Remove the first element and add it to the end
        }

        // Sort the array in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the first 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
3. **Rotation**: The `remove(0)` method removes the first element, and `add()` appends it to the end of the list.
4. **Sorting**: `Collections.sort()` is used to sort the list, and `Collections.reverseOrder()` sorts it in descending order.
5. **Printing**: We use `System.out.println()` to print the first three elements of the sorted list.