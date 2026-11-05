Certainly! Below is the Java translation of the provided Python function.

### Python Code
```python
data = [74, 43, 60, 53, 24, 35, 63, 32, 7, 71]
height = [int(data.pop(0)) for i in range(10)]
sort = sorted(height, reverse=True)
for i in range(3):
    print((sort[i]))
```

### Java Equivalent
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);

        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0)); // Pop the first element
        }

        Collections.sort(height, Collections.reverseOrder()); // Sort in reverse order

        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i)); // Print the top 3 heights
        }
    }
}
```

### Explanation:
- The `List<Integer>` is used to hold the data, similar to the list in Python.
- `Collections.addAll()` is used to initialize the list with values.
- The `for` loop is used to remove elements from the start of the list (similar to `pop(0)` in Python).
- `Collections.sort()` is used to sort the list in reverse order.
- Finally, a loop prints the top three sorted values.