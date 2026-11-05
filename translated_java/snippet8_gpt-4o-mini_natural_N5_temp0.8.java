Here’s the equivalent Java code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        
        // Initialize the list with values
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);
        
        // Move the first element to the end 10 times
        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Remove the first element
            m.add(x); // Append it to the end
        }
        
        // Sort the list in ascending order
        Collections.sort(m);
        
        // Reverse the list to get it in descending order
        Collections.reverse(m);
        
        // Print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList Initialization**: We use an `ArrayList<Integer>` to hold the integers, allowing dynamic size and easy manipulation.
2. **Adding Elements**: The `Collections.addAll` method is used to initialize the list with the given values.
3. **Looping**: The `for` loop iterates 10 times, removing the first element and appending it to the end.
4. **Sorting and Reversing**: The `Collections.sort()` method sorts the list in ascending order, and `Collections.reverse()` is used to reverse the sorted list for descending order.
5. **Printing**: Finally, we print the first three elements using the `get` method on the list.