Here's the equivalent Java code that compiles successfully and maintains the same logic as your provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(84);
        list.add(47);
        list.add(46);
        list.add(100);
        list.add(92);
        list.add(95);
        list.add(39);
        list.add(64);
        list.add(50);
        list.add(5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element and store it
            list.add(t); // Append it to the end
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` and `Collections` for dynamic array functionality and sorting.
2. **ArrayList Initialization**: We initialize the `ArrayList` and add the integers to it.
3. **Looping**: We loop 10 times to pop the first element and append it at the end.
4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing**: Finally, we print the first three elements of the sorted list.

This code will compile and run in a Java environment, producing the same output as the original Python code.