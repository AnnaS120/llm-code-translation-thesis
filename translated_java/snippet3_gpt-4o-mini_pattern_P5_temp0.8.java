Here's the translated Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        ans.add(34);
        ans.add(12);
        ans.add(51);
        ans.add(64);
        ans.add(82);
        ans.add(55);
        ans.add(31);
        ans.add(36);
        ans.add(66);
        ans.add(4);

        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(ans, Collections.reverseOrder()); // Sort in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
- **List Initialization**: In Java, we use `ArrayList` to create a dynamic array-like structure.
- **Adding Elements**: We utilize the `add()` method of `ArrayList` to insert elements.
- **Removing and Adding Elements**: The `remove(0)` method removes the first element, and we then add it to the end of the list using `add()`.
- **Sorting**: The `Collections.sort()` method is used to sort the list in reverse order.
- **Printing Elements**: We retrieve the first three elements using `get(i)` and print them out.