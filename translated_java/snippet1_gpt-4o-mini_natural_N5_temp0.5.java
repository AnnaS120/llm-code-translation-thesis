Here’s how you can convert the provided Python code into Java code that compiles successfully. We'll use appropriate Java data types and structure the methods accordingly.

### Java Code

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the array
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Rotate the array 10 times
        for (int i = 0; i < 10; i++) {
            // Remove the first element and add it to the end
            int firstElement = arr.remove(0); // pop(0)
            arr.add(firstElement); // append
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

1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, as it allows dynamic resizing, similar to Python's list.

2. **Collections.addAll**: This method is used to initialize the list with multiple elements in one line.

3. **Rotation of the Array**: We use `arr.remove(0)` to remove the first element and then `arr.add(firstElement)` to append it to the end, simulating the `pop(0)` and `append()` in Python.

4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.

5. **Printing**: We access the elements using `arr.get(i)` to print the top 3 elements. 

This Java code should compile and run successfully, producing the same output as the original Python code.