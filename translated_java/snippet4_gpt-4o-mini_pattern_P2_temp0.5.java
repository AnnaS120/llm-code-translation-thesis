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

        Collections.sort(lists, Collections.reverseOrder()); // Sort in descending order

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(lists.get(idx)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList` to hold the list of integers, similar to Python lists.
2. **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
3. **remove(0)**: This removes the first element from the list, similar to `pop(0)` in Python.
4. **add(a)**: This appends the removed element to the end of the list.
5. **Collections.sort**: We sort the list in descending order using `Collections.reverseOrder()`.
6. **get(idx)**: This retrieves the element at the specified index, similar to indexing in Python. 

This Java code replicates the functionality of the original Python code.