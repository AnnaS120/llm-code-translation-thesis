Here’s the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element and store it in t
            list.add(t); // Append t to the end of the list
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort the list in descending order
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: The Python list is replaced with an `ArrayList` in Java.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with values.
3. **Removing and Appending**: The `remove(0)` method removes the first element, and `add(t)` appends it to the end.
4. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: The first three elements are printed using `System.out.println()`.