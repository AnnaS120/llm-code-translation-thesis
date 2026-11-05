Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        int N = 10;

        for (int count = 0; count < N; count++) {
            h.add(h.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(h, Collections.reverseOrder()); // Sort in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
3. **Loop**: The loop iterates `N` times, removing the first element and appending it to the end of the list.
4. **Sorting**: `Collections.sort` is used to sort the list in reverse order.
5. **Printing**: Finally, we print the first three elements of the sorted list. 

This Java code replicates the functionality of the original Python code.