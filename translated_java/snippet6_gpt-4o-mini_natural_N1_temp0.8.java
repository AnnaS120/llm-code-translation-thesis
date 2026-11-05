Certainly! Below is the translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element and return it
            list.add(t); // Add it to the end of the list
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation of Java Code:
1. **Import Statements**: We import `ArrayList` and `Collections` for list manipulations.
2. **ArrayList Initialization**: We create an `ArrayList<Integer>` and populate it with the given values.
3. **For Loop**: We iterate 10 times, removing the first element from the list (`remove(0)`) and appending it to the end.
4. **Sorting**: We use `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the first three elements of the sorted list.

You can run this Java code in any Java environment to see the results.