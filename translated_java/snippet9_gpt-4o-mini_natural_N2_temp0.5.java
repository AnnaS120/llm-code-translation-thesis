Certainly! Below is the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        // Create an array to hold the heights
        int[] height = new int[10];
        
        // Pop elements from the list and fill the height array
        for (int i = 0; i < 10; i++) {
            height[i] = data.remove(0);
        }
        
        // Convert the height array to a list for sorting
        ArrayList<Integer> heightList = new ArrayList<>();
        for (int h : height) {
            heightList.add(h);
        }
        
        // Sort the list in reverse order
        Collections.sort(heightList, Collections.reverseOrder());
        
        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(heightList.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList Usage**: In Java, we use `ArrayList` for dynamic arrays similar to Python lists.
2. **Populating the List**: The `remove(0)` method is used to mimic the `pop(0)` behavior in Python, which removes the first element.
3. **Sorting**: The `Collections.sort()` method sorts the list, and `Collections.reverseOrder()` is used to sort it in descending order.
4. **Printing**: The top three elements are printed using a simple loop.

This Java code maintains the same logic and structure as the original Python code.