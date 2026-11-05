Certainly! Below is the equivalent Java code for the provided Python function:

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
1. **Java Collections**: We use `ArrayList` to store the integers, similar to Python's list.
2. **Adding Elements**: We use `Collections.addAll()` to initialize the list with integers.
3. **Loop for Modification**: The loop replaces the first element (using `remove(0)`) and appends it to the end of the list.
4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the first three elements from the sorted list.

You can run this Java code in any Java environment to see the same result as the original Python code.