Here’s the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        mt.add(90);
        mt.add(99);
        mt.add(69);
        mt.add(5);
        mt.add(27);
        mt.add(13);
        mt.add(94);
        mt.add(88);
        mt.add(77);
        mt.add(77);

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
1. **ArrayList**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Adding Elements**: We use `add()` to append elements to the list.
3. **Removing Elements**: The `remove(0)` method removes the first element, similar to `pop(0)` in Python.
4. **Sorting**: `Collections.sort()` is used to sort the list.
5. **Accessing Elements**: We use `get(index)` to access elements in the list, similar to indexing in Python.

This Java code maintains the same logic and structure as the original Python code.