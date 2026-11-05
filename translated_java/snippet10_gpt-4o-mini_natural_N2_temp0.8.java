Sure! Below is the equivalent Java code that replicates the logic and structure of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0));  // Remove the first element and add it to the end
        }

        Collections.sort(mt);  // Sort the list

        // Print the top three elements
        System.out.println(mt.get(9));  // 10th largest
        System.out.println(mt.get(8));  // 9th largest
        System.out.println(mt.get(7));  // 8th largest
    }
}
```

### Explanation:
1. **List Initialization**: We use an `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Pop and Append**: The `remove(0)` method removes the first element, and `add()` appends it to the end of the list.
3. **Sorting**: We use `Collections.sort()` to sort the list.
4. **Printing**: We access the elements at the specified indices directly with `get()`, which is akin to index access in Python.

Make sure to run this Java code in an appropriate environment that supports Java.