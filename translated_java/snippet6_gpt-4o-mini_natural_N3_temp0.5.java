Here's the provided Python function rewritten as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element
            list.add(t); // Append it to the end
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the top 3 elements
        }
    }
}
```

### Explanation:
1. **Imports**: Necessary imports for `ArrayList`, `Collections`, and `List`.
2. **List Initialization**: A list is created and initialized with values using `Collections.addAll()`.
3. **Loop**: The loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()`.
5. **Printing**: The top three elements of the sorted list are printed using `System.out.println()`.