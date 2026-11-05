To convert the provided Python code to Java, we need to take care of several aspects such as array handling, list manipulation, sorting, and printing. Here's how you can do it:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the array
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        // Perform the rotation and append the first element to the end
        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0));
        }

        // Sort the array in descending order
        Collections.sort(arr, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation of the Java Code:

1. **Imports**: The code imports `ArrayList` and `Collections` for dynamic array handling and sorting.

2. **Main Method**: The `main` method serves as the entry point for the Java program.

3. **Array Initialization**: An `ArrayList` is initialized with integer values similar to the Python list.

4. **Element Rotation**: The loop rotates the elements by removing the first element (using `remove(0)`) and adding it to the end (using `add`).

5. **Sorting**: The `Collections.sort()` method sorts the list in reverse order.

6. **Printing Elements**: A loop prints the first three elements of the sorted list.

This Java code closely mimics the functionality of the original Python code while adhering to Java syntax and conventions.