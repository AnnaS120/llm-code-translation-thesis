Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Loop iteration
        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        // Sort in reverse order
        Collections.sort(ans, Collections.reverseOrder());

        // Loop iteration to print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with values.
3. **Looping**: The `for` loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Another `for` loop prints the first three elements of the sorted list. 

This Java code replicates the functionality of the original Python code.