Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Loop iteration
        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0)); // Remove the first element and add it to the end
        }

        // Sort in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Loop iteration to print the first 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to Python's list.
2. **Adding Elements**: `Collections.addAll` is used to initialize the list with values.
3. **Looping**: The `for` loop iterates 10 times, where `arr.remove(0)` removes the first element and `arr.add(...)` appends it to the end.
4. **Sorting**: `Collections.sort` with `Collections.reverseOrder()` sorts the list in descending order.
5. **Printing**: Another `for` loop prints the first three elements of the sorted list. 

This Java code replicates the functionality of the original Python code.