Here’s the translation of the given Python function into Java:

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
- **ArrayList**: In Java, we use `ArrayList` to store a dynamic array of integers.
- **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
- **mt.remove(0)**: This removes the first element from the list, similar to `pop(0)` in Python.
- **mt.add(...)**: This adds the removed element to the end of the list.
- **Collections.sort(mt)**: This sorts the list in ascending order.
- **mt.get(index)**: This retrieves the element at the specified index, similar to Python's indexing. 

This Java code replicates the behavior of the provided Python code.