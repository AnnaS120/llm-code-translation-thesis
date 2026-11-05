Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        for (int idx = 0; idx < 10; idx++) {
            arr.add(arr.remove(0));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(arr.get(idx));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: `Collections.addAll` is used to initialize the list with values.
3. **Looping and Modifying the List**: The `remove(0)` method removes the first element, and `add()` appends it to the end of the list.
4. **Sorting**: `Collections.sort` with `Collections.reverseOrder()` sorts the list in descending order.
5. **Printing**: We use `System.out.println` to print the first three elements of the sorted list.