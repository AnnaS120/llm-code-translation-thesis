Sure! Here’s the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        
        int N = 10;

        for (int n = 0; n < N; n++) {
            // Remove the first element and add it to the end of the list
            int firstElement = h.remove(0);
            h.add(firstElement);
        }

        // Sort in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation of the Java Code:
1. **Imports**: `ArrayList` and `Collections` are imported for list manipulation and sorting.
2. **ArrayList Initialization**: Creates an `ArrayList<Integer>` to store the numbers.
3. **Loop**: A for-loop that performs the same operation as the Python code, rotating the elements.
4. **Sorting**: Uses `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, prints the top 3 elements from the sorted list. 

Make sure to run this Java code in an appropriate environment that supports Java (like an IDE or a terminal with Java installed).