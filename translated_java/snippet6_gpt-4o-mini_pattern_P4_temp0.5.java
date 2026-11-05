Here’s the translation of the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {  // loop iteration
            int t = list.remove(0);  // pop the first element
            list.add(t);  // append the element to the end
        }

        Collections.sort(list, Collections.reverseOrder());  // sort in reverse order
        for (int i = 0; i < 3; i++) {  // loop iteration
            System.out.println(list.get(i));  // print the first three elements
        }
    }
}
```

### Explanation:
1. **Import Statements**: We import `ArrayList` for dynamic array functionality and `Collections` for sorting.
2. **ArrayList Initialization**: We create an `ArrayList<Integer>` and populate it with the initial values.
3. **Looping and Modifying the List**: We use a loop to remove the first element and append it to the end, similar to the Python `pop` and `append` methods.
4. **Sorting**: We sort the list in reverse order using `Collections.sort()`.
5. **Printing**: Finally, we print the first three elements of the sorted list.

This Java code replicates the functionality of the original Python code.