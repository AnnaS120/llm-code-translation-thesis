Here’s a valid Java implementation of the provided Python snippet, preserving the original behavior:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Remove the first element
            m.add(x); // Append it to the end
        }

        Collections.sort(m); // Sort the list
        Collections.reverse(m); // Reverse the list

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **List Initialization**: We use an `ArrayList` to store the integers, similar to the Python list.
2. **Loop for Popping and Appending**: The loop removes the first element and appends it to the end of the list, mimicking the behavior of `pop(0)` and `append()` in Python.
3. **Sorting and Reversing**: We use `Collections.sort()` to sort the list and `Collections.reverse()` to reverse it.
4. **Printing the First Three Elements**: Finally, we print the first three elements of the modified list.

This Java code will produce the same output as the original Python code.