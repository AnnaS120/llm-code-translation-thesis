Here's the equivalent Java code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element and store it in t
            list.add(t); // Append t to the end of the list
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort the list in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` and `Collections` for list manipulation and sorting.
2. **ArrayList Initialization**: We create an `ArrayList<Integer>` and populate it with the initial values.
3. **Loop for Manipulation**: We use a loop to remove the first element and append it to the end of the list.
4. **Sorting**: We sort the list in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing**: Finally, we print the first three elements of the sorted list. 

This Java code mirrors the functionality of the original Python code while adhering to Java's syntax and conventions.