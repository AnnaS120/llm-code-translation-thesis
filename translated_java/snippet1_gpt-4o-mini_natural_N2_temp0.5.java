Here’s the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Perform the rotation operation
        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0)); // Remove the first element and add it to the end
        }

        // Sort the array in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList Initialization**: We use `ArrayList<Integer>` to replicate the dynamic nature of Python lists.
2. **Adding Elements**: `Collections.addAll` is used to add elements to the `ArrayList`.
3. **Rotation Logic**: The loop iterates 10 times, where `arr.remove(0)` removes the first element, and `arr.add(...)` appends it to the end.
4. **Sorting**: `Collections.sort` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: The first three elements are printed using `System.out.println`. 

This Java code maintains the same logic and structure as the original Python code.