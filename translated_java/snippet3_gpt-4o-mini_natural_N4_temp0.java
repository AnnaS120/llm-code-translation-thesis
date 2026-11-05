Certainly! Below is a valid Java implementation of the provided Python snippet. The Java code preserves the original behavior, which involves manipulating a list of integers, rotating its elements, sorting them in descending order, and printing the top three values.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Rotate the list 10 times
        for (int i = 0; i < 10; i++) {
            // Remove the first element and add it to the end
            ans.add(ans.remove(0));
        }

        // Sort the list in descending order
        Collections.sort(ans, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **List Initialization**: We use an `ArrayList` to store the integers, similar to the Python list.
2. **Rotation**: The loop rotates the list by removing the first element and appending it to the end, mimicking the behavior of `ans.append(int(ans.pop(0)))` in Python.
3. **Sorting**: We sort the list in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
4. **Printing**: Finally, we print the first three elements of the sorted list.

### How to Run:
You can run this Java code in any Java development environment or online Java compiler. Just copy and paste the code into a `.java` file, compile it, and execute it to see the output.