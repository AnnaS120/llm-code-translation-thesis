Sure! Below is the translation of the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(arr, Collections.reverseOrder()); // Sort in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used instead of a native array for dynamic resizing.
2. **Collections.addAll()**: To initialize the `ArrayList`.
3. **arr.remove(0)**: This removes the first element (similar to `pop(0)` in Python).
4. **arr.add()**: Appends the removed element to the end of the list.
5. **Collections.sort()**: Sorts the list in reverse order.
6. **System.out.println()**: Used to print the first three elements of the sorted list.