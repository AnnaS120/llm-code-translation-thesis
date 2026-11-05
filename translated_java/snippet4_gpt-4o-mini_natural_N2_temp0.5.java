Here’s the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        collections.add(98);
        collections.add(50);
        collections.add(90);
        collections.add(83);
        collections.add(33);
        collections.add(40);
        collections.add(71);
        collections.add(12);
        collections.add(68);
        collections.add(66);

        // Simulating the pop and append operation
        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Pop the first element
            lists.add(a); // Append it to the end of the list
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

### Explanation:
1. **ArrayList Initialization**: We use `ArrayList<Integer>` to store the integers, similar to the list in Python.
2. **Pop and Append**: The `remove(0)` method simulates the `pop(0)` method in Python, and `add(a)` appends the element to the end of the list.
3. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: We loop through the first three elements of the sorted list and print them.