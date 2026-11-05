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
2. **Collections.addAll**: Used to initialize the list with values.
3. **h.remove(0)**: Removes the first element (similar to `pop(0)` in Python).
4. **h.add(...)**: Appends the removed element to the end of the list.
5. **Collections.sort**: Sorts the list in reverse order.
6. **System.out.println**: Prints the top three elements of the sorted list.