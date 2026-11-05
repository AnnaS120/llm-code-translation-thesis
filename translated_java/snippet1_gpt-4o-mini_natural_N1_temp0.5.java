Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Rotate the array 10 times
        for (int i = 0; i < 10; i++) {
            // Remove the first element and add it to the end
            int firstElement = arr.remove(0);
            arr.add(firstElement);
        }

        // Sort the array in descending order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:

1. **ArrayList**: In Java, we use `ArrayList` for dynamic arrays similar to Python lists.
2. **Adding Elements**: `Collections.addAll` is used to add multiple elements to the `ArrayList`.
3. **Rotation**: The loop rotates the array by removing the first element and appending it to the end.
4. **Sorting**: `Collections.sort` with `Collections.reverseOrder()` sorts the list in descending order.
5. **Printing**: The first three elements are printed using a loop. 

Make sure to import the necessary classes at the beginning of your Java file.