Here's a Java version of your Python code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] data = {74, 43, 60, 53, 24, 35, 63, 32, 7, 71};
        Integer[] height = new Integer[10];

        // Populating the height array
        for (int i = 0; i < 10; i++) {
            height[i] = data[i]; // No need to 'pop' in this context, just directly assign
        }

        // Sorting the array in reverse order
        Arrays.sort(height, Collections.reverseOrder());

        // Printing the top three heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height[i]);
        }
    }
}
```

### Explanation:

1. **Data Types**: 
   - The `data` array is defined as `Integer[]` to facilitate sorting with `Collections.reverseOrder()`.
   - The `height` array is also declared as `Integer[]`.

2. **Populating the Array**: 
   - Instead of using the `pop()` method (which is not available in Java), we directly assign values from `data` to `height`.

3. **Sorting**: 
   - The `Arrays.sort()` method is used along with `Collections.reverseOrder()` to sort the `height` array in descending order.

4. **Output**: 
   - The top three heights are printed using a simple loop, similar to the original Python code.

This code will compile and run in a Java environment, providing the same functionality as your Python example.