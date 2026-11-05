Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {  // loop iteration
            int x = m.remove(0);        // remove the first element
            m.add(x);                   // append it to the end of the list
        }

        Collections.sort(m);            // sort the list
        Collections.reverse(m);         // reverse the list

        for (int i = 0; i < 3; i++) {  // loop iteration
            System.out.println(m.get(i)); // print the first three elements
        }
    }
}
```

### Explanation:
1. **Data Structure**: The Python list is replaced with an `ArrayList` in Java.
2. **Element Manipulation**: The `pop(0)` method in Python is replaced with `remove(0)` in Java, and `append` is replaced with `add`.
3. **Sorting and Reversing**: Java's `Collections.sort()` and `Collections.reverse()` are used for sorting and reversing the list.
4. **Printing Elements**: The printing mechanism is done with `System.out.println()` in Java.

This code will achieve the same functionality as the Python code you provided.