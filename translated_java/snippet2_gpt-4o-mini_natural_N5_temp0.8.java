Sure! Below is the equivalent Java code that replicates the functionality of the provided Python code.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        
        // Initializing the list with values
        h.add(66);
        h.add(13);
        h.add(1);
        h.add(72);
        h.add(84);
        h.add(93);
        h.add(70);
        h.add(37);
        h.add(17);
        h.add(98);

        final int N = 10;

        // Rotating the list
        for (int n = 0; n < N; n++) {
            h.add(h.remove(0));
        }

        // Sorting the list in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Printing the top 3 values
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation:
1. **Imports and Class Declaration**: We import `ArrayList` and `Collections` from the `java.util` package and declare the `Main` class.
2. **List Initialization**: A `ArrayList<Integer>` is created and populated with the initial values.
3. **List Rotation**: We use a loop to rotate the list, similar to the `append` and `pop` operations in Python.
4. **Sorting the List**: We sort the list in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing the Top 3 Values**: A loop fetches and prints the first three elements of the sorted list.

This code should compile and run successfully in a Java environment.