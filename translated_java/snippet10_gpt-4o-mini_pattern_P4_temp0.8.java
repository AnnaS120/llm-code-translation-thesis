Sure! Below is the translation of the provided Python function into Java:

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

        Collections.sort(mt);

        System.out.println(mt.get(9)); // 10th largest element
        System.out.println(mt.get(8)); // 9th largest element
        System.out.println(mt.get(7)); // 8th largest element
    }
}
```

### Explanation:

1. **ArrayList**: We use `ArrayList<Integer>` in Java to mimic the dynamic list behavior of Python's list.
2. **Adding Elements**: `Collections.addAll` is used to add the initial elements to the ArrayList.
3. **Loop**: The loop iterates 10 times, removing the first element (`remove(0)`) and adding it to the end of the list (`add(...)`).
4. **Sorting**: `Collections.sort` is called to sort the list.
5. **Printing**: We use `System.out.println` to print the 10th, 9th, and 8th largest elements, which correspond to the indices 9, 8, and 7 after sorting.