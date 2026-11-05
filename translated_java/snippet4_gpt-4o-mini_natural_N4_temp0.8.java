To translate the provided Python code into a valid Java implementation, let's break down the logic step-by-step:

1. We have a list of integers.
2. We remove the first element from the list and append it to the end of the list ten times.
3. Finally, we sort the list in descending order and print the top three elements.

Here’s how you can implement this in Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initializing the list with values
        List<Integer> lists = new ArrayList<>();
        lists.add(98);
        lists.add(50);
        lists.add(90);
        lists.add(83);
        lists.add(33);
        lists.add(40);
        lists.add(71);
        lists.add(12);
        lists.add(68);
        lists.add(66);

        // Performing the pop and append operations
        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Remove the first element
            lists.add(a);            // Append it to the end
        }

        // Sort the list in descending order
        Collections.sort(lists, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i));
        }
    }
}
```

### Explanation:

1. **List Initialization**: We use an `ArrayList` to store the integers, similar to the Python list.
2. **Loop for Modification**: We loop ten times, removing the first element (`remove(0)`) and adding it to the end of the list (`add(a)`).
3. **Sorting**: The `Collections.sort` method is used with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: Finally, we print the first three elements of the sorted list.

This Java code maintains the behavior of the original Python code accurately.