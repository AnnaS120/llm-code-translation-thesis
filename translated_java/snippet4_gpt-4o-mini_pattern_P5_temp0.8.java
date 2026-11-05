Here’s how you can translate the given Python function into Java:

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

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Remove the first element
            lists.add(a); // Add it to the end of the list
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
1. **ArrayList Initialization**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Loop**: We use a loop to pop the first element and append it to the end, similar to `lists.pop(0)` and `lists.append(a)` in Python.
3. **Sorting**: Java's `Collections.sort()` method is used along with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: The top three elements are printed using a loop accessing the first three elements of the sorted list.

Make sure to import the necessary classes when implementing this code.