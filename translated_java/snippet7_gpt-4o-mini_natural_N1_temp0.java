Here’s how you can translate the given Python function into Java:

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
1. **Array Initialization**: In Java, we use an `Integer[]` array to hold the values.
2. **Sorting**: We use `Arrays.sort()` with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A simple loop prints the first three elements of the sorted array. 

This Java code will produce the same output as the original Python code.