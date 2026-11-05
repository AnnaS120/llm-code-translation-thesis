Here's the equivalent Java method that replicates the functionality of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);
        rotateAndPrintTopThree(lists);
    }

    public static void rotateAndPrintTopThree(List<Integer> lists) {
        for (int i = 0; i < 10; i++) {
            Integer a = lists.remove(0); // Remove the first element
            lists.add(a); // Append it to the end
        }

        // Sort the list in reverse order
        Collections.sort(lists, Collections.reverseOrder());

        // Print the top three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList`, `Collections`, and `List` to work with lists in Java.
2. **Main Method**: This is the entry point of the program where we initialize the list and call the method.
3. **Method Definition**: The `rotateAndPrintTopThree` method performs the same operations as the Python code:
   - It removes the first element of the list and appends it to the end, repeating this process 10 times.
   - It sorts the list in reverse order.
   - It prints the top three elements from the sorted list.