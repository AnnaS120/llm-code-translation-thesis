Sure! Below is the equivalent Java code for the provided Python function:

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
1. **Array Declaration**: The `mountList` is declared as an `Integer` array, which is similar to a list of integers in Python.
2. **Sorting**: The `Arrays.sort` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: A simple loop is used to print the first three elements of the sorted array. 

Make sure to run this code in a Java environment to see the output!