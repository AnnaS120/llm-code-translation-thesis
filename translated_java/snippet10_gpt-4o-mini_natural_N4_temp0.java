Here’s a valid Java implementation of the provided Python snippet, preserving the original behavior:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(mt); // Sort the list

        // Print the last three elements in the sorted list
        System.out.println(mt.get(9)); // 10th element (largest)
        System.out.println(mt.get(8)); // 9th element
        System.out.println(mt.get(7)); // 8th element
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to a list in Python.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with the given integers.
3. **Loop**: The loop iterates 10 times, removing the first element (`mt.remove(0)`) and adding it to the end of the list (`mt.add(...)`).
4. **Sorting**: `Collections.sort(mt)` sorts the list in ascending order.
5. **Printing**: Finally, we print the last three elements of the sorted list, which correspond to the 10th, 9th, and 8th largest values. 

This Java code will produce the same output as the original Python snippet.