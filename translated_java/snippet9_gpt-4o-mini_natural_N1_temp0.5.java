Here’s the translation of the provided Python function into Java:

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
            height.add(data.remove(0));
        }

        Collections.sort(height, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:

1. **Imports**: We import necessary classes from the Java Collections Framework.
2. **List Initialization**: We use `ArrayList` to store the initial data.
3. **Populating `height`**: We remove the first element from `data` and add it to `height` in a loop.
4. **Sorting**: We sort `height` in reverse order using `Collections.sort`.
5. **Printing Top 3**: We print the first three elements from the sorted list.

This Java code replicates the functionality of the original Python code.