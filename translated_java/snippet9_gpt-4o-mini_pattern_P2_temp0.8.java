Sure! Below is the Java equivalent of the provided Python function, which retrieves, sorts, and prints the top three heights from the `data` list.

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] data = {74, 43, 60, 53, 24, 35, 63, 32, 7, 71};
        Integer[] height = new Integer[10];

        // Pop elements from data array into height array
        for (int idx = 0; idx < 10; idx++) {
            height[idx] = data[idx];
        }

        // Sort height array in descending order
        Arrays.sort(height, Collections.reverseOrder());

        // Print the top 3 heights
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(height[idx]);
        }
    }
}
```

### Explanation:
1. **Data Initialization**: The `data` array is created with the given values.
2. **Populating Height Array**: Instead of using `pop()`, we directly assign the values from `data` to `height` since arrays in Java have a fixed size.
3. **Sorting**: The `Arrays.sort` method sorts the `height` array in descending order using `Collections.reverseOrder()`.
4. **Printing**: Finally, a loop prints the top three heights. 

Make sure to run this code in a Java environment, as it includes imports and syntax specific to Java.