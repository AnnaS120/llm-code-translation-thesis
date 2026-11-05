Here's the equivalent Java code that replicates the functionality of your Python code. This Java program uses appropriate data types and method structure to compile successfully.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Rotate the list 10 times
        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        // Sort the list in descending order
        Collections.sort(ans, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used to store the integers, similar to Python's list.
2. **Collections.addAll**: Used to add multiple elements to the `ArrayList`.
3. **Loop for rotation**: The `remove(0)` method removes the first element, and `add()` appends it to the end of the list.
4. **Sorting**: `Collections.sort()` sorts the list, and `Collections.reverseOrder()` sorts it in descending order.
5. **Printing**: The top three elements are printed using `System.out.println()`.

This code will compile and run in a Java environment, producing the same output as your original Python code.