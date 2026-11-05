Here's the equivalent Java code for the provided Python code. This Java code uses appropriate data types and method structure to ensure it compiles successfully:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the list
        ArrayList<Integer> lists = new ArrayList<>();
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

        // Perform the operation similar to the Python code
        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Remove the first element
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

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to hold the list of integers, similar to the Python list.
2. **Looping**: The `for` loop iterates 10 times, removing the first element and appending it to the end, just like in the Python code.
3. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: Finally, we print the top three elements using another loop.

This Java code will compile and run, producing the same output as the original Python code.