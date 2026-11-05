Here's the translated Python function into Java:

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
            mt.add(mt.remove(0)); // Pops the first element and adds it to the end
        }

        Collections.sort(mt); // Sorts the list

        // Prints the top three elements
        System.out.println(mt.get(9)); // 1st largest
        System.out.println(mt.get(8)); // 2nd largest
        System.out.println(mt.get(7)); // 3rd largest
    }
}
```

### Explanation:
- The `ArrayList` is used to maintain a dynamic array that can easily resize.
- The `remove(0)` method is used to simulate the `pop(0)` in Python, and the `add()` method appends the element to the end of the list.
- `Collections.sort(mt)` is used to sort the list in ascending order.
- Finally, the top three elements are printed using `get(index)`, where the index is based on the sorted order.