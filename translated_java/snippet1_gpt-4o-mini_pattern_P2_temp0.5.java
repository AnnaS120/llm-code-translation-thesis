Here's the translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Move the first element to the end of the list 10 times
        for (int idx = 0; idx < 10; idx++) {
            arr.add(arr.remove(0));
        }

        // Sort the list in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the first 3 elements
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(arr.get(idx));
        }
    }
}
```

### Explanation:
1. **ArrayList**: In Java, we use `ArrayList` instead of a list. We import `java.util.ArrayList` and `java.util.Collections` for list operations.
2. **Adding Elements**: We use `Collections.addAll` to initialize the list with values.
3. **Loop for Moving Elements**: The loop that moves the first element to the end is achieved using `arr.remove(0)` to remove the first element and `arr.add(...)` to append it to the end.
4. **Sorting**: We use `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing Elements**: We use `System.out.println` to print the first three elements of the sorted list.

This Java code replicates the functionality of the original Python code.