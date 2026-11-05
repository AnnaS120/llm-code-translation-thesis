Here is the equivalent Java code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Pop the first element
            lists.add(a); // Append it to the end
        }

        Collections.sort(lists, Collections.reverseOrder()); // Sort in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i)); // Print the top 3 elements
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` for the list structure and `Collections` for sorting.
2. **ArrayList Initialization**: We create an `ArrayList<Integer>` to hold the integers.
3. **Looping**: The loop structure is similar; we use `remove(0)` to simulate the pop operation and `add()` to append to the end.
4. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Output**: We use `System.out.println()` to print the top three sorted values. 

This structure maintains the logic of the original Python code while adhering to Java syntax and conventions.