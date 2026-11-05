Sure! Below is a Java implementation of the provided Python code snippet. This implementation preserves the original behavior of the Python code.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the list with the same values
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        
        int N = 10;

        // Perform the rotation and append
        for (int n = 0; n < N; n++) {
            // Remove the first element and add it to the end
            h.add(h.remove(0));
        }

        // Sort the list in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation of the Java Code:
1. **ArrayList Initialization**: An `ArrayList` is used to hold the initial values, similar to the list in Python.
2. **Rotation**: Inside the loop, the first element is removed from the list and added back to the end, mimicking the behavior of `pop(0)` in Python.
3. **Sorting**: The list is sorted in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
4. **Printing**: The first three elements of the sorted list are printed.

This Java code provides the same functionality and output as the original Python snippet.