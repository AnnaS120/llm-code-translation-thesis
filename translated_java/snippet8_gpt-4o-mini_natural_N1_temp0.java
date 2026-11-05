Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
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
1. **ArrayList**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
3. **remove(0)**: This method removes the first element of the list, similar to `pop(0)` in Python.
4. **add(x)**: This appends the element to the end of the list.
5. **Collections.sort()**: This sorts the list in ascending order.
6. **Collections.reverse()**: This reverses the order of the list.
7. **System.out.println()**: This prints the elements, similar to the `print()` function in Python. 

This Java code replicates the functionality of the original Python code.