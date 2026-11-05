Here’s the equivalent Java code for the provided Python function:

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
1. **ArrayList**: Used instead of a list to store integers.
2. **`Collections.addAll()`**: To initialize the list with values.
3. **Loop**: A for-loop that runs 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: The `Collections.sort()` method sorts the list.
5. **Printing**: The last three elements (after sorting) are printed using `get()` method.

This Java code will produce the same output as the original Python code.