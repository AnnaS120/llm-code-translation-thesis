Sure! Below is the equivalent Java code for your Python function:

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

        Collections.sort(h, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i)); // Print the top 3 elements
        }
    }
}
```

### Explanation:

1. **ArrayList**: We use `ArrayList<Integer>` to mimic the list behavior in Python.
2. **Collections.addAll**: This is used to initialize the list with values.
3. **Loop**: The loop iterates `N` times, removing the first element and appending it to the end of the list.
4. **Sorting**: We use `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the top three elements of the sorted list. 

You can run this Java code in any Java environment to see the results.