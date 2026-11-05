Certainly! Below is the Java version of the provided Python code. This code compiles successfully, uses appropriate data types, and follows Java's method structure.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Initialize the list with the given values
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Move the first element to the end of the list 10 times
        for (int i = 0; i < 10; i++) {
            int firstElement = ans.remove(0);
            ans.add(firstElement);
        }

        // Sort the list in reverse order
        Collections.sort(ans, Collections.reverseOrder());

        // Print the first 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: The Python list is replaced with an `ArrayList<Integer>` for dynamic sizing and easy manipulation.
2. **Initialization**: The `Collections.addAll()` method is used to initialize the list with the given values.
3. **Loop**: The loop structure in Java is similar to Python's, but uses `int` for indexing.
4. **Removing and Adding Elements**: `remove(0)` and `add()` methods are used to mimic the `pop(0)` and `append()` functionality of Python lists.
5. **Sorting**: `Collections.sort()` is used with `Collections.reverseOrder()` to sort the list in descending order.
6. **Printing Elements**: The `System.out.println()` method is used to print the elements.

You can run this Java code in any Java IDE or online compiler to see the output.