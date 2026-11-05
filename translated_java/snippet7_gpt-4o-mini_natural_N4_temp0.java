Certainly! Below is a valid Java implementation of the provided Python snippet. The Java code preserves the original behavior, which involves creating a list of integers, sorting it in descending order, and then printing the top three values.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> mountList = new ArrayList<>();
        int[] numbers = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};

        // Populate the list with integers
        for (int number : numbers) {
            mountList.add(number);
        }

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
1. **List Creation**: We use an `ArrayList` to store the integers.
2. **Populating the List**: We loop through an array of integers and add each element to the `mountList`.
3. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
4. **Printing the Top Three Values**: We loop through the first three elements of the sorted list and print them.

This Java code will produce the same output as the original Python snippet.