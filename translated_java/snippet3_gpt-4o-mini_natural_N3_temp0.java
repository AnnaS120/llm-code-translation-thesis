Here’s the provided Python function rewritten as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);
        
        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0));
        }
        
        Collections.sort(ans, Collections.reverseOrder());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: The `ArrayList` and `Collections` classes are imported to handle dynamic arrays and sorting.
2. **ArrayList Initialization**: The `ans` list is initialized and populated using `Collections.addAll()`.
3. **Loop for Reordering**: A loop is used to remove the first element and append it to the end of the list, similar to the Python `pop(0)` and `append()`.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()`.
5. **Printing**: The top three elements are printed using `System.out.println()`. 

This Java method replicates the functionality of the original Python code while adhering to Java conventions.