Here’s the equivalent Java method that replicates the functionality of the provided Python code. This method will create a list of integers, sort it in descending order, and print the top three values.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MountListExample {

    public static void main(String[] args) {
        printTopThreeMounts();
    }

    public static void printTopThreeMounts() {
        // Create a list of integers
        List<Integer> mountList = new ArrayList<>();
        Collections.addAll(mountList, 51, 95, 14, 69, 20, 99, 3, 37, 55, 87);
        
        // Sort the list in descending order
        Collections.sort(mountList, Collections.reverseOrder());
        
        // Print the top three values
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import necessary classes from the `java.util` package.
2. **List Initialization**: We use `ArrayList` to create a list of integers and populate it.
3. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing**: We loop through the first three elements of the sorted list and print them. 

This method can be called from the `main` method for execution.