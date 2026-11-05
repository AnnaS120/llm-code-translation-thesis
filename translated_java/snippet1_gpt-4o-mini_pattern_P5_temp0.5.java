Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);
        
        // Move the first element to the end of the list 10 times
        for (int i = 0; i < 10; i++) {
            int firstElement = arr.remove(0); // Remove the first element
            arr.add(firstElement); // Add it to the end
        }
        
        // Sort the list in reverse order
        Collections.sort(arr, Collections.reverseOrder());
        
        // Print the first 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **List Initialization**: In Java, we use `ArrayList` for dynamic arrays.
2. **Adding Elements**: `Collections.addAll` is used to initialize the list with values.
3. **Looping and Manipulating the List**: The loop removes the first element and adds it to the end of the list, similar to the Python code.
4. **Sorting**: `Collections.sort` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing Elements**: Finally, we print the first three elements of the sorted list. 

You can run this Java code in any Java environment to see the output.