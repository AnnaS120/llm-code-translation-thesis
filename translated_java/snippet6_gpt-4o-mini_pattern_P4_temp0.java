Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {  // loop iteration
            int t = list.remove(0);  // remove the first element
            list.add(t);  // append it to the end
        }

        Collections.sort(list, Collections.reverseOrder());  // sort in descending order
        for (int i = 0; i < 3; i++) {  // loop iteration
            System.out.println(list.get(i));  // print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to Python's list.
2. **Collections.addAll**: This method is used to initialize the list with values.
3. **remove(0)**: This method removes the first element of the list, similar to `pop(0)` in Python.
4. **add(t)**: This appends the removed element to the end of the list.
5. **Collections.sort**: This sorts the list in descending order.
6. **System.out.println**: This prints the first three elements of the sorted list.