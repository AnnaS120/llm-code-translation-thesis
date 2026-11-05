Here’s the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(ans, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:

1. **List Initialization**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: We use `Collections.addAll` to add the initial elements to the list.
3. **Looping and Modifying the List**: The `remove(0)` method removes the first element, and `add` appends it to the end of the list.
4. **Sorting**: We use `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing Elements**: We iterate through the first three elements and print them using `System.out.println`.

This Java code will produce the same output as the original Python function.