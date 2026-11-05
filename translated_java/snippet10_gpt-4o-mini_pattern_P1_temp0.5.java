Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0));
        }

        Collections.sort(mt);
        System.out.println(mt.get(9));
        System.out.println(mt.get(8));
        System.out.println(mt.get(7));
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` instead of a list, as it's the closest equivalent in Java to Python's list.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with elements.
3. **Looping**: The `for` loop iterates 10 times, using `mt.remove(0)` to remove the first element and `mt.add()` to append it to the end.
4. **Sorting**: `Collections.sort(mt)` sorts the list.
5. **Printing Elements**: We use `mt.get(index)` to access elements by index, similar to Python's list indexing.

Make sure to import the necessary classes for this code to run.