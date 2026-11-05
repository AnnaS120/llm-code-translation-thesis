Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int i = 0; i < 10; i++) {  // loop iteration
            mt.add(mt.remove(0));  // Remove the first element and add it to the end
        }

        Collections.sort(mt);  // Sort the list

        // Print the last three elements in sorted order
        System.out.println(mt.get(9));  // 10th element (largest)
        System.out.println(mt.get(8));  // 9th element
        System.out.println(mt.get(7));  // 8th element
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with values.
3. **Loop**: The `for` loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: `Collections.sort()` is used to sort the list.
5. **Printing**: We access the last three elements using `get(index)` method, which corresponds to the indices 9, 8, and 7 in the sorted list.