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
1. **ArrayList**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Adding Elements**: `Collections.addAll()` is used to add multiple elements to the `ArrayList`.
3. **Loop**: The loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: `Collections.sort()` is used to sort the list.
5. **Printing Elements**: The `get()` method retrieves elements from the list, similar to indexing in Python. 

This Java code will produce the same output as the original Python code.