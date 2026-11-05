Here's the equivalent Java code for the provided Python logic:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the data array
        int[] data = {74, 43, 60, 53, 24, 35, 63, 32, 7, 71};

        // Create a list to hold the heights
        ArrayList<Integer> height = new ArrayList<>();

        // Populate the height list by "popping" from the data array
        for (int i = 0; i < 10; i++) {
            height.add(data[i]);
        }

        // Sort the list in reverse order
        Collections.sort(height, Collections.reverseOrder());

        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Data Initialization**: The `data` array is initialized with the same values as in Python.
2. **Height List**: An `ArrayList` is used to store heights extracted from the `data` array, simulating the `pop` functionality (though we directly access elements since Java doesn't have a built-in method for "popping" like Python lists).
3. **Sorting**: The `Collections.sort()` method sorts the heights in descending order.
4. **Printing the Top Heights**: A loop prints the top three heights, similar to the Python version.