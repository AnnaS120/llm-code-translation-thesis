Here’s how you can translate the provided Python function into Java:

### Java Code:
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0));
        }

        Collections.sort(ans, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation of the Code:
1. **Import Statements**: We import `ArrayList` for dynamic array functionality and `Collections` for sorting.
2. **Initialization**: We create an `ArrayList<Integer>` and populate it with the initial values using `Collections.addAll()`.
3. **Rearranging Elements**: We loop 10 times, removing the first element of the list and appending it to the end.
4. **Sorting**: We sort the list in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing Results**: Finally, we print the first three elements of the sorted list.

This Java implementation mirrors the functionality of the original Python code closely.