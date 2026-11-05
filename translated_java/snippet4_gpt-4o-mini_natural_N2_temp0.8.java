Certainly! The given Python code manipulates a list by popping the first element and appending it to the end multiple times, and then it sorts the list in descending order and prints the top three elements. Below is the equivalent Java code that maintains the same logic and structure.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Remove the first element
            lists.add(a); // Append it to the end
        }

        // Sort in descending order
        Collections.sort(lists, Collections.reverseOrder());

        // Print the top three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i));
        }
    }
}
```

### Explanation:
1. **Import Statements**: The `ArrayList` and `Collections` classes are imported to manage the list and sorting functionality.
2. **Initialization**: The list is initialized using `Collections.addAll()`.
3. **Loop to Modify List**: A loop runs 10 times, removing the first element and adding it to the end of the list.
4. **Sorting**: The list is sorted in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing Top Three Elements**: A loop prints the first three elements of the sorted list.

This Java code closely follows the structure and logic of the original Python code.