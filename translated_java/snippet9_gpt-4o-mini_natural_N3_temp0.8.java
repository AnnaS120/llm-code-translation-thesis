Here's the provided Python function rewritten as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Call the method to demonstrate functionality
        printTopThreeHeights();
    }

    public static void printTopThreeHeights() {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);

        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0)); // Pop the first element
        }

        Collections.sort(height);
        Collections.reverse(height); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i)); // Print the top three heights
        }
    }
}
```

### Explanation:
1. **Imports**: We import necessary classes like `ArrayList`, `Collections`, and `List`.
2. **Main Class**: The Java code is wrapped in a class called `Main`, which is standard in Java.
3. **Method**: `printTopThreeHeights` is defined as a static method to perform the desired operations.
4. **List Initialization**: We use `ArrayList` to store the initial data and heights.
5. **Element Removal**: The `remove(0)` method is used to mimic the `pop(0)` behavior of Python, removing the first element.
6. **Sorting**: We sort the heights using `Collections.sort(height)` and then reverse the order.
7. **Printing**: The top three heights are printed using a loop.

This code will produce the same output as the original Python function.