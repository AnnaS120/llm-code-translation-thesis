Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        
        // Initializing the array
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
        
        // Loop iteration
        for (int i = 0; i < 10; i++) {
            // Remove the first element and add it to the end
            int firstElement = arr.remove(0);
            arr.add(firstElement);
        }
        
        // Sort the array in reverse order
        Collections.sort(arr, Collections.reverseOrder());
        
        // Loop iteration to print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation of the Code:
1. **List Initialization**: We use `ArrayList` to store the integers, similar to a Python list.
2. **Looping**: The outer loop iterates 10 times. During each iteration, it removes the first element (using `remove(0)`) and appends it to the end of the list (using `add()`).
3. **Sorting**: We sort the list in reverse order using `Collections.sort()` with `Collections.reverseOrder()`.
4. **Printing**: Finally, we loop through the first three elements of the sorted list and print them.

This Java implementation closely mirrors the functionality of the original Python code.