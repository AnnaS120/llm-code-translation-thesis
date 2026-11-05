Here’s the equivalent Java method that follows the same logic as the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // pops the first element
            m.add(x); // appends it to the end
        }

        Collections.sort(m); // sorts the list
        Collections.reverse(m); // reverses the list

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i)); // prints the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used `ArrayList` to mimic Python's list behavior.
2. **Collections.addAll**: Used to initialize the list with values.
3. **Looping**: The `for` loop syntax in Java is slightly different from Python.
4. **Removing and Adding Elements**: Used `remove(0)` to pop the first element and `add(x)` to append it.
5. **Sorting and Reversing**: Utilized `Collections.sort()` and `Collections.reverse()` for sorting and reversing the list.
6. **Printing Elements**: Used `System.out.println()` to print the elements.