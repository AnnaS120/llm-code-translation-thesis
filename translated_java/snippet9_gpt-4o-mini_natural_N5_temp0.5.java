Certainly! Below is the equivalent Java code for the provided Python code. This Java code uses appropriate data types and follows the structure of methods:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        // Create height list by removing the first element from data
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0)); // Pop the first element
        }
        
        // Sort height in reverse order
        Collections.sort(height, Collections.reverseOrder());
        
        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Data Structure**: We use an `ArrayList<Integer>` for the `data` and `height` lists.
2. **Populating the List**: The `data.remove(0)` method is used to simulate the `pop` operation in Python.
3. **Sorting**: The `Collections.sort()` method sorts the list, and `Collections.reverseOrder()` is used to sort it in descending order.
4. **Printing**: We access the top three elements using `height.get(i)` and print them.

This Java code should compile and run successfully, providing the same output as the original Python code.