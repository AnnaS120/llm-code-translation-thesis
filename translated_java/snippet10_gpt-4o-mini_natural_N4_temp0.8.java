Here's a valid Java implementation of the provided Python snippet. The Java code preserves the original behavior, including manipulating the list and sorting it.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayList with the given values
        ArrayList<Integer> mt = new ArrayList<>();
        mt.add(90);
        mt.add(99);
        mt.add(69);
        mt.add(5);
        mt.add(27);
        mt.add(13);
        mt.add(94);
        mt.add(88);
        mt.add(77);
        mt.add(77);

        // Perform the operation as in the Python snippet
        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }

        // Sort the ArrayList
        Collections.sort(mt);

        // Print the required elements
        System.out.println(mt.get(9)); // 10th element (largest)
        System.out.println(mt.get(8)); // 9th element
        System.out.println(mt.get(7)); // 8th element
    }
}
```

### Explanation:

1. **ArrayList Initialization**: In Java, we use `ArrayList<Integer>` to store the integers, similar to how lists are used in Python.
2. **Looping**: The `for` loop in Java is structured similarly to Python, iterating 10 times.
3. **Manipulating the List**: `mt.remove(0)` removes the first element, and `mt.add(...)` adds that element to the end of the list.
4. **Sorting**: `Collections.sort(mt)` sorts the list in ascending order.
5. **Printing**: The `System.out.println()` statements print the 10th, 9th, and 8th elements of the sorted list, respectively.

This implementation maintains the behavior of the original Python code while adhering to Java syntax and conventions.