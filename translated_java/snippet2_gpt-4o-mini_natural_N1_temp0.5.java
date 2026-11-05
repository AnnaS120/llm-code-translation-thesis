Here's the translated Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        int N = 10;

        // Rotate the list N times
        for (int n = 0; n < N; n++) {
            int firstElement = h.remove(0); // Remove the first element
            h.add(firstElement); // Append it to the end
        }

        // Sort the list in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` for dynamic array functionality and `Collections` for sorting and utility methods.
2. **Initialization**: We create an `ArrayList` and populate it with the initial values.
3. **Rotation**: We use a loop to rotate the list `N` times, removing the first element and adding it to the end of the list.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()`.
5. **Printing**: Finally, we print the top three elements of the sorted list.