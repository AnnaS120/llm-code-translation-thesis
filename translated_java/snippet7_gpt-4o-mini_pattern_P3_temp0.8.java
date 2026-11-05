Here is the equivalent Java code for the provided Python function:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N1 = 95;
        int N2 = 87;
        int N3 = 99;
        int N4 = 55;
        int N5 = 14;
        int N6 = 51;
        int N7 = 69;
        int N8 = 37;
        int N9 = 20;
        int N10 = 3;

        // Create an array with the values
        int[] numbers = {N6, N1, N5, N7, N9, N3, N10, N8, N4, N2};

        // Convert array to a list
        List<Integer> mountList = new ArrayList<>();
        for (int number : numbers) {
            mountList.add(number);
        }

        // Sort the list in descending order
        Collections.sort(mountList, Collections.reverseOrder());

        // Print the top N10 elements
        for (int i = 0; i < N10; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

### Explanation:

1. **Variable Initialization**: The integers `N1` to `N10` are initialized as in the Python code.

2. **Array Creation**: An array named `numbers` is created containing the values.

3. **List Conversion**: A `List<Integer>` (`mountList`) is created and populated using a for-each loop.

4. **Sorting**: The `Collections.sort()` method is used to sort the list in descending order.

5. **Printing**: A loop iterates over the first `N10` elements of the sorted list and prints each element. 

This Java code directly translates the functionality of the original Python code while adhering to Java's syntax and conventions.