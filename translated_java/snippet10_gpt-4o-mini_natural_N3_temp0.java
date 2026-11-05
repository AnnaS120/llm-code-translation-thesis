Here's the equivalent Java method that follows the correct syntax and conventions:

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
1. **ArrayList**: Used `ArrayList<Integer>` to store the integers, similar to Python's list.
2. **Adding Elements**: Used `Collections.addAll()` to initialize the list with values.
3. **Loop**: The `for` loop iterates 10 times, using `remove(0)` to pop the first element and `add()` to append it to the end.
4. **Sorting**: Used `Collections.sort()` to sort the list.
5. **Printing**: Used `System.out.println()` to print the top three elements after sorting.