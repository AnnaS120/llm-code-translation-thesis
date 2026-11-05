Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a list and add the values
        List<Integer> mountList = new ArrayList<>();
        int[] values = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};

        // Step 2: Convert array to list
        for (int value : values) {
            mountList.add(value);
        }

        // Step 3: Sort the list in reverse order
        Collections.sort(mountList, Collections.reverseOrder());

        // Step 4: Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

### Explanation:
1. **Creating a List:** We use `ArrayList` to create a list in Java.
2. **Adding Values:** We iterate over a predefined array of integers and add each integer to the `mountList`.
3. **Sorting the List:** We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing Values:** We use a loop to print the first three elements of the sorted list. 

This Java code replicates the functionality of the original Python code.