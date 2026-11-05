Here's the equivalent Java code for the provided Python logic:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Initialize the array
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
        
        // Perform the rotation of elements 10 times
        for (int i = 0; i < 10; i++) {
            int firstElement = arr.remove(0); // Remove the first element
            arr.add(firstElement); // Append it to the end
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
- **ArrayList**: Used for dynamic array functionality similar to Python's list.
- **Initialization**: The integers are added to the `ArrayList` using `add()` method.
- **Rotation**: We remove the first element (at index `0`) and add it to the end of the list using `remove()` and `add()` methods.
- **Sorting**: The `Collections.sort()` method is utilized to sort the list in reverse order.
- **Printing**: The first three elements are printed using a loop and the `get()` method of `ArrayList`. 

This Java code maintains the same logic and structure as the original Python code.