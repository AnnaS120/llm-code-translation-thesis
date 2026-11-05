Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        int N = 10;

        // Loop iteration
        for (int n = 0; n < N; n++) {
            h.add(h.remove(0)); // Remove the first element and add it to the end
        }

        // Sort in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Loop iteration to print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList Initialization**: We use `ArrayList<Integer>` to hold the integers, similar to the Python list.
2. **Adding Elements**: We populate the list using `Collections.addAll()`.
3. **Looping**: The loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: We sort the list in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing**: Finally, we print the first three elements of the sorted list.

This Java code maintains the same logic and functionality as the original Python code.