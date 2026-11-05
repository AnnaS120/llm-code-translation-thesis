Certainly! Below is a valid Java implementation of the provided Python snippet. The Java code preserves the original behavior of the Python code, which involves manipulating an array, sorting it in reverse order, and printing the top three elements.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Perform the operation of popping the first element and appending it to the end
        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0));
        }

        // Sort the array in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to mimic the dynamic array behavior of Python lists.
2. **Adding Elements**: `Collections.addAll` is used to initialize the list with the given integers.
3. **Loop for Popping and Appending**: The loop iterates 10 times, removing the first element (`arr.remove(0)`) and appending it to the end of the list (`arr.add(...)`).
4. **Sorting**: `Collections.sort` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the first three elements of the sorted list.

This Java code will produce the same output as the original Python code.