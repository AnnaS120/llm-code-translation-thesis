Here's the equivalent Java code for the provided Python code. This code creates an integer list, performs the same operations, and prints the three largest values:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        // Perform the same operation as the Python code
        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(mt); // Sort the list

        // Print the three largest values
        System.out.println(mt.get(9)); // Largest value
        System.out.println(mt.get(8)); // Second largest value
        System.out.println(mt.get(7)); // Third largest value
    }
}
```

### Key Points:
1. **ArrayList**: Used in place of Python's list to hold integers.
2. **Collections.addAll()**: Used to initialize the list with values.
3. **mt.remove(0)**: Removes the first element in the list, similar to `mt.pop(0)` in Python.
4. **Collections.sort()**: Sorts the list in ascending order.
5. **mt.get(index)**: Retrieves the element at the specified index, similar to indexing in Python. 

This Java code should compile and run successfully, producing the same output as the original Python code.