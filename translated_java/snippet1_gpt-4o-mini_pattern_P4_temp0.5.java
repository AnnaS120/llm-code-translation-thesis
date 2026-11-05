Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Loop iteration
        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0)); // Remove the first element and add it to the end
        }

        // Sort in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Loop iteration to print the first 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to hold the integers, similar to the Python list.
2. **Adding Elements**: `Collections.addAll` is used to initialize the `ArrayList` with the given values.
3. **Looping and Modifying the List**: In the loop, `arr.remove(0)` removes the first element, and `arr.add(...)` appends it to the end of the list.
4. **Sorting**: `Collections.sort(arr, Collections.reverseOrder())` sorts the list in descending order.
5. **Printing**: The final loop prints the first three elements of the sorted list. 

This Java code replicates the behavior of the original Python function.