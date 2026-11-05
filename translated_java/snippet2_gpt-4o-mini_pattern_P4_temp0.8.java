Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        int[] initialArray = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};

        // Initialize the ArrayList with the initial array values
        for (int num : initialArray) {
            h.add(num);
        }

        int N = 10;

        // Loop iteration
        for (int n = 0; n < N; n++) {
            h.add(h.remove(0));  // Remove first element and add it to the end
        }

        // Sort in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Loop iteration to print the first three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList Initialization**: In Java, we use `ArrayList` to store the integers dynamically, similar to Python lists.
2. **Adding Elements**: We initialize the `ArrayList` with elements from an array.
3. **Looping Logic**: The loop shifts the first element to the end of the list using `remove(0)` and `add()`.
4. **Sorting**: We use `Collections.sort()` to sort the list in reverse order.
5. **Printing**: Finally, we print the first three elements of the sorted list.

This Java code closely follows the structure and logic of the original Python code.