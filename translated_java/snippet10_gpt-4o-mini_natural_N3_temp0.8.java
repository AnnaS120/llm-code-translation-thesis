Here’s how to rewrite the provided Python function as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0)); // remove the first element and add it to the end
        }

        Collections.sort(mt);

        System.out.println(mt.get(9)); // 10th largest element
        System.out.println(mt.get(8)); // 9th largest element
        System.out.println(mt.get(7)); // 8th largest element
    }
}
```

### Breakdown of the Conversion:
1. **Data Structure**: Used `ArrayList<Integer>` instead of a list.
2. **Adding Elements**: Used `Collections.addAll()` to initialize the list with elements.
3. **Looping**: Used a standard `for` loop with integer indexing.
4. **List Manipulation**: Used `mt.remove(0)` to remove the first element and `mt.add(...)` to append it to the end of the list.
5. **Sorting**: Used `Collections.sort()` to sort the list.
6. **Accessing Elements**: Used `mt.get(index)` to access elements instead of using indexing directly like in Python.

This code will produce the same output as the original Python code.