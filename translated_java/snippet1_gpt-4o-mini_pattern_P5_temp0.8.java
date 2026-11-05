Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Initialize the array with the given values
        arr.add(3);
        arr.add(54);
        arr.add(57);
        arr.add(45);
        arr.add(93);
        arr.add(98);
        arr.add(80);
        arr.add(100);
        arr.add(58);
        arr.add(96);

        // Perform the operations equivalent to the Python code
        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0)); // Remove the first element and append it to the end
        }

        // Sort the array in reverse order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the first 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:

1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to a list in Python.
2. **Initialization**: The values are added to the list using the `add()` method.
3. **Loop**: The loop `for (int i = 0; i < 10; i++)` mimics the Python loop, where we remove the first element (using `remove(0)`) and append it to the end of the list.
4. **Sorting**: We sort the list in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
5. **Printing**: Finally, we print the first three elements of the sorted list. 

This Java code replicates the behavior of the original Python function.