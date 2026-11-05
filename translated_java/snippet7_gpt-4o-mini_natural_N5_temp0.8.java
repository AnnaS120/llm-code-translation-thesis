Sure! Below is the equivalent Java code that compiles successfully and replicates the functionality of the provided Python code.

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create the array of integers
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
1. **Import Statements**: The code imports `Arrays` and `Collections` to handle array sorting.
2. **Integer Array**: It initializes an `Integer` array with the given values.
3. **Sorting**: The `Arrays.sort()` method is used along with `Collections.reverseOrder()` to sort the array in descending order.
4. **Loop**: A simple loop prints the first three elements from the sorted array.

You can run this Java code in any Java environment, and it will give you the top three integers from the sorted list in descending order.