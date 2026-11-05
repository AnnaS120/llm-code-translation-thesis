Here's the equivalent Java code that compiles successfully, using appropriate data types and method structure:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // Remove the first element and get its value
            list.add(t); // Add it back to the end of the list
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i)); // Print the top 3 elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used to create a dynamic array similar to Python's list.
2. **Collections.addAll**: Initializes the list with values.
3. **remove(0)**: Removes the element at index 0 (the first element) and retrieves its value.
4. **add(t)**: Appends the removed element to the end of the list.
5. **Collections.sort(list, Collections.reverseOrder())**: Sorts the list in descending order.
6. **get(i)**: Retrieves the element at index `i` for printing.