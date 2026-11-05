Certainly! Below is a valid Java implementation of the provided Python snippet, preserving its original behavior:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0));
        }

        Collections.sort(ans, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with values.
3. **Looping and Modifying the List**: The `for` loop iterates 10 times, removing the first element with `remove(0)` and appending it to the end of the list.
4. **Sorting**: We sort the list in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing**: Finally, we print the top three elements of the sorted list.

This Java code effectively replicates the behavior of the provided Python snippet.