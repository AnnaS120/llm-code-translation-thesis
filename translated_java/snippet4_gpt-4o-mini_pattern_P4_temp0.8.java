Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {  // loop iteration
            int a = lists.remove(0);    // remove the first element
            lists.add(a);               // append it to the end
        }

        // Sort the list in reverse order
        Collections.sort(lists, Collections.reverseOrder());

        // Print the first three elements of the sorted list
        for (int i = 0; i < 3; i++) {  // loop iteration
            System.out.println(lists.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import necessary classes from the `java.util` package.
2. **List Initialization**: We use `ArrayList` to create a list and add the initial integers.
3. **Loop for Reordering**: We loop 10 times to remove the first element and append it to the end.
4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we loop through the first three elements of the sorted list and print them. 

This code mirrors the functionality of the original Python code while adhering to Java syntax and conventions.