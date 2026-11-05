Here's the Python function translated into Java:

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
            h.add(h.remove(0));
        }

        // Sort the list in descending order
        Collections.sort(h, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation
1. **Imports**: We import `ArrayList` and `Collections` from the `java.util` package.
2. **List Initialization**: We create an `ArrayList<Integer>` to hold the integers.
3. **Rotation**: We rotate the list `N` times by removing the first element and adding it back to the end.
4. **Sorting**: We sort the list in descending order using `Collections.sort()`.
5. **Printing**: Finally, we print the top 3 elements of the sorted list.