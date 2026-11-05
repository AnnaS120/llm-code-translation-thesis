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
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Collections.addAll**: This method is used to add multiple elements to the list at once.
3. **Looping**: The `for` loop structure is similar, but Java requires explicit type declarations.
4. **Removing and Adding Elements**: `h.remove(0)` removes the first element, and `h.add(...)` adds it to the end of the list.
5. **Sorting**: `Collections.sort` is used to sort the list in reverse order.
6. **Printing**: The `System.out.println` method is used to print the top three elements.