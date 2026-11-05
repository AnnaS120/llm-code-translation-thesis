Here’s the translation of the provided Python code into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Simulating the pop and append operations
        for (int idx = 0; idx < 10; idx++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        // Sort in reverse order
        Collections.sort(ans, Collections.reverseOrder());

        // Print the first three elements
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(ans.get(idx));
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used to replicate Python's list functionality.
2. **`Collections.addAll`**: To initialize the list with values.
3. **Loop for popping and appending**: In Java, we use `remove(0)` to pop the first element and `add()` to append it to the end.
4. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort in descending order.
5. **Printing**: We access elements using `get()` method of `ArrayList`. 

This Java program will produce the same output as the original Python code.