Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        // Loop iteration
        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0); // Remove the first element
            lists.add(a); // Append it to the end
        }

        // Sort the list in reverse order
        Collections.sort(lists, Collections.reverseOrder());

        // Loop iteration to print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i)); // Print the element at index i
        }
    }
}
```

### Explanation:
1. **ArrayList**: In Java, we use `ArrayList` instead of a list.
2. **Collections.addAll**: This is used to initialize the list with values.
3. **remove(0)**: This removes the first element and returns it, similar to `pop(0)` in Python.
4. **add(a)**: This appends the removed element to the end of the list.
5. **Collections.sort**: This sorts the list, and `Collections.reverseOrder()` is used to sort it in descending order.
6. **System.out.println**: This prints the elements, similar to `print()` in Python. 

You can run this Java code in any Java environment to see the output.