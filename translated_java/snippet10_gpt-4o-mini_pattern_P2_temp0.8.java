Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int idx = 0; idx < 10; idx++) {
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(mt); // Sort the list

        // Print the last three elements after sorting
        System.out.println(mt.get(9)); // 10th element in sorted order
        System.out.println(mt.get(8)); // 9th element in sorted order
        System.out.println(mt.get(7)); // 8th element in sorted order
    }
}
```

### Explanation:
- The Python list `mt` is replaced with a Java `ArrayList`.
- The `append` and `pop` methods in Python are replaced with `add` and `remove` in Java.
- `Collections.sort(mt)` is used to sort the list.
- Finally, the last three elements in the sorted list are accessed using `get(index)` method and printed. 

You can compile and run this code in any Java IDE or online compiler.