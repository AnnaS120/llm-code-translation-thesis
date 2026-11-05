Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int idx = 0; idx < 10; idx++) {
            int a = lists.remove(0); // Remove the first element
            lists.add(a); // Append it to the end
        }

        // Sort the list in reverse order
        Collections.sort(lists, Collections.reverseOrder());

        // Print the top 3 elements
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(lists.get(idx));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
3. **remove(0)**: This removes the first element of the list, similar to `pop(0)` in Python.
4. **add(a)**: This appends the removed element to the end of the list.
5. **Collections.sort**: This sorts the list in reverse order.
6. **System.out.println**: This prints the top three elements of the sorted list. 

This Java code replicates the functionality of the original Python code.