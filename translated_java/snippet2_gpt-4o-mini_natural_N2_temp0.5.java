Here's the equivalent Java code based on your provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the list with the given values
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
            int firstElement = h.remove(0); // Remove the first element
            h.add(firstElement); // Add it to the end
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
1. **ArrayList**: Used instead of a list, as it provides dynamic array capabilities similar to Python lists.
2. **Looping**: The `for` loop in Java is structured similarly to Python but uses different syntax.
3. **Removing and Adding Elements**: The `remove(0)` method is used to pop the first element, and `add()` is used to append it to the end of the list.
4. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: The `System.out.println()` method is used to print the top three elements. 

This Java code maintains the same logic and structure as the original Python code.