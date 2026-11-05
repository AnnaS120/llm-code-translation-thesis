Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        
        // Initialize the list
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
        for (int count = 0; count < N; count++) {
            int firstElement = h.remove(0); // Remove the first element
            h.add(firstElement); // Append it to the end
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
1. **ArrayList**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Initialization**: The list is populated using `add()` method.
3. **Rotation**: The loop rotates the list by removing the first element and adding it to the end.
4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the top three elements using a simple loop. 

This Java code replicates the behavior of the original Python code.