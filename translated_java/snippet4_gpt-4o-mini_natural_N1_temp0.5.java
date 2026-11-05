Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Pop the first element
            lists.add(a); // Append it to the end
        }

        // Sort the list in reverse order
        Collections.sort(lists, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i));
        }
    }
}
```

### Breakdown of the Java Code:
1. **Imports**: We import necessary classes from the Java Collections Framework.
2. **List Initialization**: We use `ArrayList` to store the integers, similar to Python's list.
3. **Loop**: We loop 10 times to pop the first element and append it to the end.
4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: We print the first three elements of the sorted list.

This Java code replicates the functionality of the original Python code.