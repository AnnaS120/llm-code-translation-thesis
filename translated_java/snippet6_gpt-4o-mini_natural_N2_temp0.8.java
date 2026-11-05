Here’s the equivalent Java code based on the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0);
            list.add(t);
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
```

### Explanation:
1. **List Creation**: Initializes a list and populates it with integers using `Collections.addAll()`.
2. **Loop to Pop and Append**: Iterates 10 times, removes the first element, and appends it to the end of the list.
3. **Sorting**: Uses `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing Elements**: Finally, it prints the first three elements of the sorted list.