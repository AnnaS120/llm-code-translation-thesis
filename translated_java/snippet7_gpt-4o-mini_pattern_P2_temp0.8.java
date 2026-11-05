Certainly! Here's how you can translate the given Python function into Java:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        
        // Sort the array in descending order
        Arrays.sort(mountList, Collections.reverseOrder());
        
        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList[i]);
        }
    }
}
```

### Explanation:
1. **Array Initialization**: The list of integers is initialized as an array of `Integer`.
2. **Sorting**: We use `Arrays.sort()` with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing Top 3 Elements**: A loop iterates over the first three elements of the sorted array and prints them.

Make sure to run this code within a Java environment to see the output, which should match the top three largest numbers from the original Python snippet.