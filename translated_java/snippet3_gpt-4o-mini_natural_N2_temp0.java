Here’s the equivalent Java code for the provided Python code:

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
1. **ArrayList**: Used to store the integers, similar to Python's list.
2. **Collections.addAll**: Used to initialize the list with values.
3. **Loop**: The `for` loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: `Collections.sort` with `Collections.reverseOrder()` sorts the list in descending order.
5. **Printing**: The last loop prints the first three elements of the sorted list. 

This Java code maintains the same logic and structure as the original Python code.