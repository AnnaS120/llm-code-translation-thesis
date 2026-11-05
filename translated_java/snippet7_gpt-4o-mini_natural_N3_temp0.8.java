Here’s the equivalent Java method that accomplishes the same task as your provided Python function. This Java method sorts an array of integers in descending order and then prints the top three values.

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        printTopThreeMounts();
    }

    public static void printTopThreeMounts() {
        Integer[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        
        // Sort the array in descending order
        Arrays.sort(mountList, Collections.reverseOrder());
        
        // Print the top three values
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList[i]);
        }
    }
}
```

### Explanation:
1. **Imports**: The `Arrays` and `Collections` classes from the Java standard library are imported for sorting.
2. **Array Declaration**: An `Integer` array is used instead of a list, as Java arrays are a common choice for such tasks.
3. **Sorting**: The `Arrays.sort` method is used with `Collections.reverseOrder()` to sort the array in descending order.
4. **Printing**: A simple `for` loop iterates through the first three elements of the sorted array to print them.