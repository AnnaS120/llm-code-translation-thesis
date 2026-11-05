Sure! Here's the translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        
        int N = 10;

        for (int n = 0; n < N; n++) {
            h.add(h.remove(0)); // Remove the first element and append it to the end
        }

        Collections.sort(h, Collections.reverseOrder()); // Sort in descending order

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(h.get(idx)); // Print the first three elements
        }
    }
}
```

### Explanation:

1. **ArrayList**: We use `ArrayList<Integer>` to store the integers since it provides dynamic sizing like a Python list.
2. **Adding elements**: `Collections.addAll()` is used to initialize the list with values.
3. **Loop**: The `for` loop iterates `N` times, removing the first element and appending it to the end of the list using `h.remove(0)` and `h.add()`.
4. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the first three elements of the sorted list using `h.get(idx)`.

This Java code closely follows the logic of your Python function.