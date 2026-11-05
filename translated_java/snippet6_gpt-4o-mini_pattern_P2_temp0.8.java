Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);
        
        for (int idx = 0; idx < 10; idx++) {
            int t = list.remove(0); // Pop the first element
            list.add(t); // Append it to the end
        }
        
        Collections.sort(list, Collections.reverseOrder()); // Sort in descending order
        
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(list.get(idx)); // Print the top three elements
        }
    }
}
```

### Breakdown of the Translation:
- **ArrayList**: Used in Java to create a dynamic array similar to a list in Python.
- **Collections.addAll**: This method initializes the ArrayList with values.
- **list.remove(0)**: This simulates `pop(0)` in Python by removing the first element of the list.
- **list.add(t)**: Appends the element to the end of the list.
- **Collections.sort(..., Collections.reverseOrder())**: Sorts the list in descending order.
- **System.out.println**: Used to print to the console, equivalent to Python's `print()` function.

### Note:
Make sure to import required classes like `ArrayList` and `Collections` when using this code in a Java environment.