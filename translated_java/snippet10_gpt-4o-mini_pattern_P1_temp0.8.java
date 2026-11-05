Sure! Here's how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0)); // Remove first element and append to the end
        }

        Collections.sort(mt); // Sort the list

        // Print the top three elements
        System.out.println(mt.get(9)); // 1st largest
        System.out.println(mt.get(8)); // 2nd largest
        System.out.println(mt.get(7)); // 3rd largest
    }
}
```

### Explanation:
- **ArrayList**: Used instead of Python's list to store integers.
- **Collections.addAll**: Populates the `ArrayList` with initial values.
- **mt.remove(0)**: Removes the first element (similar to `pop(0)` in Python).
- **mt.add(...)**: Appends the removed element to the end of the list.
- **Collections.sort(mt)**: Sorts the list in ascending order.
- **System.out.println**: Prints the largest three elements from the sorted list. 

Make sure to import the necessary classes at the top of the Java file!