Here's the equivalent Java code for your given Python function:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] mountArray = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        
        // Convert the array to a list and sort it in reverse order
        List<Integer> mountList = Arrays.asList(mountArray);
        Collections.sort(mountList, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

### Explanation:
1. **Array to List Conversion**: We use `Arrays.asList()` to convert the array into a list.
2. **Sorting**: `Collections.sort()` is used along with `Collections.reverseOrder()` to sort the list in descending order.
3. **Printing the Top 3 Elements**: A simple for loop iterates over the first three elements of the sorted list and prints them. 

Make sure to import the necessary classes at the beginning of your Java file.