Here’s the equivalent Java method that replicates the functionality of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Rotate the array 10 times
        for (int i = 0; i < 10; i++) {
            int firstElement = arr.remove(0); // Remove the first element
            arr.add(firstElement); // Append it to the end
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
2. **Collections.addAll**: This method is used to add elements to the `ArrayList`.
3. **Remove and Add**: The `remove(0)` method removes the first element, and `add(firstElement)` appends it to the end of the list.
4. **Sorting**: `Collections.sort` is used to sort the list in reverse order.
5. **Printing**: We retrieve and print the first three elements using `get(i)`.

This code will produce the same output as the original Python code.