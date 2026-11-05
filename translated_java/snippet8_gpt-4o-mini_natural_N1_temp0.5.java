Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Remove the first element and store it in x
            m.add(x); // Append x to the end of the list
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
- **ArrayList**: Used to create a dynamic array similar to Python's list.
- **Collections.addAll**: Used to initialize the list with values.
- **remove(0)**: Removes the first element of the list and returns it.
- **add(x)**: Appends `x` to the end of the list.
- **Collections.sort(m)**: Sorts the list in ascending order.
- **Collections.reverse(m)**: Reverses the order of the list.
- The loop at the end prints the first three elements of the sorted and reversed list.