Here's the equivalent Java code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(66);
        h.add(13);
        h.add(1);
        h.add(72);
        h.add(84);
        h.add(93);
        h.add(70);
        h.add(37);
        h.add(17);
        h.add(98);
        
        int N = 10;

        // Rotate the list N times
        for (int n = 0; n < N; n++) {
            h.add(h.remove(0)); // Remove the first element and add it to the end
        }

        // Sort the list in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: Used `add()` method to add elements to the list.
3. **Rotation**: Used `remove(0)` to remove the first element and `add()` to append it to the end of the list.
4. **Sorting**: Used `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Used `System.out.println()` to print the top three elements. 

This Java code mirrors the functionality of the original Python code while adhering to Java's syntax and conventions.