Sure! Below is a valid Java implementation of the provided Python snippet, preserving the original behavior:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        for (int i = 0; i < 10; i++) {
            // Move the first element to the end of the list
            Integer firstElement = arr.remove(0);
            arr.add(firstElement);
        }

        // Sort the list in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList Initialization**: The array is initialized as an `ArrayList` to allow dynamic resizing.
2. **Loop**: The loop runs 10 times, popping the first element and appending it to the end of the list.
3. **Sorting**: The `Collections.sort()` method with a reverse order comparator is used to sort the list in descending order.
4. **Printing**: Finally, the first three elements of the sorted list are printed.

This Java implementation replicates the functionality of the provided Python code.