Sure! Below is the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element
            list.add(t); // Append it to the end
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **List Initialization**: We use an `ArrayList` to store the integers, similar to Python's list.
2. **Looping and Modifying the List**: The `remove(0)` method removes the first element, and `add(t)` appends it to the end of the list.
3. **Sorting**: We use `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: Finally, we print the first three elements of the sorted list. 

This Java code maintains the same logic and functionality as the original Python code.