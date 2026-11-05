Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {  // loop iteration
            int t = list.remove(0);     // Remove the first element and store it in t
            list.add(t);                // Append t to the end of the list
        }

        Collections.sort(list, Collections.reverseOrder());  // Sort the list in descending order

        for (int i = 0; i < 3; i++) {  // loop iteration
            System.out.println(list.get(i));  // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList:** In Java, we use `ArrayList` to create a dynamic array, similar to Python lists.
2. **Adding elements:** `Collections.addAll(list, ...)` is used to initialize the list with elements.
3. **Loop and pop/append:** The `remove(0)` method removes the first element and returns it, similar to `pop(0)` in Python. `add(t)` appends the element to the end of the list.
4. **Sorting:** `Collections.sort(list, Collections.reverseOrder())` sorts the list in descending order.
5. **Printing elements:** We use `System.out.println(list.get(i))` to print the first three elements of the sorted list.