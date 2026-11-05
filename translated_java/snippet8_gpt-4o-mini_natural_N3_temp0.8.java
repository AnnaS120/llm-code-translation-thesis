Here’s the equivalent Java method that follows proper Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);
        
        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Pop the first element
            m.add(x); // Append it to the end
        }
        
        Collections.sort(m); // Sort the list
        Collections.reverse(m); // Reverse the list
        
        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **Imports**: The `ArrayList`, `Collections`, and `List` classes are imported for list operations.
2. **List Initialization**: An `ArrayList` is initialized and populated using `Collections.addAll()`.
3. **Loop for Manipulating the List**: A loop is used to remove the first element and add it to the end, mimicking the `pop` and `append` functionality in Python.
4. **Sorting and Reversing**: The `Collections.sort()` and `Collections.reverse()` methods are used to sort and reverse the list.
5. **Printing Elements**: Finally, the first three elements are printed in the same way as in the original Python code.