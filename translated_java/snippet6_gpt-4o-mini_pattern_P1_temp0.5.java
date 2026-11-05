Here's the equivalent Java code for the provided Python function:

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

        Collections.sort(list, Collections.reverseOrder()); // Sort the list in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation of the Code:
1. **Imports**: We import `ArrayList` and `Collections` for list manipulation.
2. **Initialization**: We create an `ArrayList` and populate it with the initial values.
3. **Loop**: We loop 10 times to remove the first element and append it to the end of the list.
4. **Sorting**: We sort the list in reverse order using `Collections.sort()`.
5. **Printing**: We print the first three elements of the sorted list.

This Java code mimics the behavior of the original Python code closely.