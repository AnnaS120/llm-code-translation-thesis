Here’s how you can convert the provided Python code into Java code that compiles successfully. The Java version will use appropriate data types and method structure.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Remove the first element and store it in 'a'
            lists.add(a); // Append 'a' to the end of the list
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
1. **Imports**: We import `ArrayList` and `Collections` for list manipulation and sorting.
2. **ArrayList Initialization**: We initialize an `ArrayList<Integer>` and populate it with the given integers.
3. **Loop for Manipulation**: We use a loop to remove the first element and append it to the end of the list, similar to the Python `pop` and `append` methods.
4. **Sorting**: We sort the list in reverse order using `Collections.sort()`.
5. **Printing**: Finally, we print the top three elements from the sorted list.

This Java code will compile and run, producing the same output as the original Python code.