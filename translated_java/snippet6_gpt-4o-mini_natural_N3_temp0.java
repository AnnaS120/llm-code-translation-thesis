Here’s the provided Python function rewritten as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 84, 47, 46, 100, 92, 95, 39, 64, 50, 5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0);
            list.add(t);
        }

        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: The necessary classes from the Java Collections Framework are imported.
2. **List Initialization**: An `ArrayList` is created and initialized with the given integers.
3. **Loop for Pop and Append**: A loop is used to remove the first element and append it to the end of the list.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()`.
5. **Printing**: The first three elements of the sorted list are printed.

This Java method replicates the functionality of the original Python code while adhering to Java conventions.