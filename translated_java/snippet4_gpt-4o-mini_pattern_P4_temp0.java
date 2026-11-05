Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {  // loop iteration
            int a = lists.remove(0);  // pop(0) in Python
            lists.add(a);  // append in Python
        }

        Collections.sort(lists, Collections.reverseOrder());  // sort in reverse order

        for (int i = 0; i < 3; i++) {  // loop iteration
            System.out.println(lists.get(i));  // print the top 3 elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Collections.addAll**: This method is used to add multiple elements to the `ArrayList`.
3. **remove(0)**: This is equivalent to `pop(0)` in Python, which removes the first element of the list.
4. **add(a)**: This appends the element to the end of the list.
5. **Collections.sort**: This sorts the list, and `Collections.reverseOrder()` is used to sort it in descending order.
6. **get(i)**: This retrieves the element at index `i`, similar to accessing elements in a Python list.

This Java code will produce the same output as the original Python code.