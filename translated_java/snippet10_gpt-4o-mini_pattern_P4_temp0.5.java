Sure! Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int i = 0; i < 10; i++) {  // loop iteration
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(mt);
        System.out.println(mt.get(9)); // Print the 10th largest element
        System.out.println(mt.get(8)); // Print the 9th largest element
        System.out.println(mt.get(7)); // Print the 8th largest element
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to Python's list.
2. **Adding Elements**: `Collections.addAll` is used to initialize the list with values.
3. **Looping**: The `for` loop iterates 10 times, using `remove(0)` to pop the first element and `add` to append it to the end.
4. **Sorting**: `Collections.sort(mt)` sorts the list in ascending order.
5. **Printing**: We access the last three elements using `get(index)` to print the required values.

This Java code will achieve the same result as the provided Python function.