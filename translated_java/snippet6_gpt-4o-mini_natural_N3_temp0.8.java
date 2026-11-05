Sure! Below is the equivalent Java method that performs the same operations as the provided Python function.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        // Mimicking the behavior of the Python code
        for (int i = 0; i < 10; i++) {
            int t = list.remove(0); // pop(0) in Python
            list.add(t); // append(t) in Python
        }

        // Sorting the list in reverse order
        Collections.sort(list, Collections.reverseOrder());

        // Printing the top 3 values
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
```

### Explanation:
1. **Import Statements**: The necessary classes from the Java Collections Framework (`ArrayList` and `Collections`) are imported.
2. **List Initialization**: An `ArrayList` is created and initialized with the values.
3. **Main Logic**: A loop removes the first element and appends it to the end of the list, mimicking the `pop(0)` and `append()` operations in Python.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()`.
5. **Printing**: The top three elements are printed using `System.out.println()`.

This code can be run in any Java environment and will produce the same output as the original Python code.