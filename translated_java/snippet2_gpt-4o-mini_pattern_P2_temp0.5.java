Sure! Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        int N = 10;

        for (int n = 0; n < N; n++) {
            // Remove the first element and add it to the end of the list
            h.add(h.remove(0));
        }

        // Sort the list in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Print the top 3 elements
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(h.get(idx));
        }
    }
}
```

### Explanation:
1. **ArrayList**: In Java, we use `ArrayList` from the `java.util` package to handle dynamic arrays.
2. **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
3. **Looping**: The `for` loop is similar to Python, but Java requires specifying the type of the loop variable.
4. **Removing and Adding Elements**: `h.remove(0)` removes the first element, and `h.add(...)` adds it to the end of the list.
5. **Sorting**: `Collections.sort()` is used to sort the list, and `Collections.reverseOrder()` is used to sort it in descending order.
6. **Printing**: The `System.out.println()` method is used to print the values.

This Java code replicates the behavior of the original Python function.