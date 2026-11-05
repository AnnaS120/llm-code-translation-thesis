Here’s how you can rewrite the provided Python function as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // pop(0) in Python
            lists.add(a);
        }

        // Sort the list in reverse order
        Collections.sort(lists, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **Imports**: The necessary imports for using `ArrayList` and `Collections` are included.
2. **List Initialization**: The list is initialized with the same values as the original Python list.
3. **Loop**: A `for` loop is used to remove the first element (simulate `pop(0)`) and append it back to the list.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()`.
5. **Output**: The top three elements are printed using a loop.

Make sure to compile and run this Java code in an appropriate environment that supports Java.