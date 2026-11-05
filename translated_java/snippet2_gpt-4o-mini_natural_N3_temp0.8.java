Here’s how you can rewrite the provided Python function as a Java method, adhering to proper Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(66);
        h.add(13);
        h.add(1);
        h.add(72);
        h.add(84);
        h.add(93);
        h.add(70);
        h.add(37);
        h.add(17);
        h.add(98);
        
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
1. **ArrayList**: Used to create a dynamic array similar to Python's list.
2. **Adding elements**: The `add()` method is used to insert elements into the `ArrayList`.
3. **Removing and adding elements**: The `remove(0)` method removes the first element and `add()` is used to append it to the end.
4. **Sorting**: `Collections.sort()` is used to sort the list in reverse order.
5. **Printing**: `System.out.println()` is used to print the top three elements after sorting.