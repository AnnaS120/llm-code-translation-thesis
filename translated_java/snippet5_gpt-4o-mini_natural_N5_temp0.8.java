Here’s how you can convert the given Python code to Java. The code sorts an array of heights in descending order and prints the top three heights.

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        
        // Sort the array in descending order
        Arrays.sort(heights, Collections.reverseOrder());
        
        // Print the top three heights
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
    }
}
```

### Explanation:
1. **Array Declaration**: In Java, we use `Integer[]` instead of a list for the heights.
2. **Sorting**: The `Arrays.sort` method is used along with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: We use a simple for loop to print the top three heights.

This Java code will compile successfully and produce the same output as your original Python code.