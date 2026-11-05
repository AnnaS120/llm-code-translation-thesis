Here’s how you can convert the given Python code into Java. The Java code will maintain the same functionality, utilizing appropriate data types and method structure.

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

        for (int n = 0; n < N; n++) {
            h.add(h.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(h, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i)); // Print the top 3 elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` instead of a list to store integers, as it is a dynamic array in Java.
2. **Adding Elements**: The `add()` method is used to add elements to the list.
3. **Removing and Adding**: The `remove(0)` method removes the first element of the list, and we immediately add it back to the end using `add()`.
4. **Sorting**: `Collections.sort()` is used to sort the list in reverse order.
5. **Printing**: We use `System.out.println()` to print the top three elements.

This Java code will compile and run successfully, providing the same output as the original Python code.