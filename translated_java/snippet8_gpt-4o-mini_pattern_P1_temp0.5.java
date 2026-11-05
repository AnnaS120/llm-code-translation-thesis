Sure! Below is the Java translation of the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Removes the first element
            m.add(x); // Appends it to the end
        }

        Collections.sort(m); // Sorts the list
        Collections.reverse(m); // Reverses the list

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i)); // Prints the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used to store the integers, similar to Python's list.
2. **Collections.addAll**: Used to initialize the list with values.
3. **remove(0)**: Removes the first element of the list (similar to `pop(0)` in Python).
4. **add(x)**: Appends the removed element to the end of the list.
5. **Collections.sort(m)**: Sorts the list in ascending order.
6. **Collections.reverse(m)**: Reverses the list.
7. **System.out.println**: Prints the first three elements of the sorted and reversed list.

This Java code will perform the same operations as the original Python code.