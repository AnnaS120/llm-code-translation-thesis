Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) { // loop iteration
            int x = m.remove(0); // remove the first element and store it in x
            m.add(x); // append x to the end of the list
        }

        Collections.sort(m); // sort the list
        Collections.reverse(m); // reverse the list

        for (int i = 0; i < 3; i++) { // loop iteration
            System.out.println(m.get(i)); // print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store integers, similar to Python's list.
2. **Collections.addAll**: This method is used to initialize the list with values.
3. **remove(0)**: This removes the first element of the list and returns it, similar to `pop(0)` in Python.
4. **add(x)**: This appends the value `x` to the end of the list.
5. **Collections.sort()**: This sorts the list in ascending order.
6. **Collections.reverse()**: This reverses the order of the list.
7. **System.out.println()**: This prints the first three elements of the list.

This Java code replicates the functionality of the original Python code.