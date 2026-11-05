Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        int N = 10;

        for (int n = 0; n < N; n++) {
            h.add(h.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(h, Collections.reverseOrder()); // Sort in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i)); // Print the top 3 elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used to store the integers, similar to Python's list.
2. **Collections.addAll**: Initializes the list with the given integers.
3. **Loop**: The loop iterates `N` times, removing the first element and appending it to the end of the list.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort`.
5. **Printing**: The top three elements are printed using a loop. 

This Java code replicates the functionality of the original Python code.