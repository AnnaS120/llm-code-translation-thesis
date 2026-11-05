Here’s how you can rewrite the provided Python function as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 98, 50, 90, 83, 33, 40, 71, 12, 68, 66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0);
            lists.add(a);
        }

        Collections.sort(lists, Collections.reverseOrder());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList`, `Collections`, and `List` to handle the list operations.
2. **List Initialization**: We create an `ArrayList` and populate it using `Collections.addAll()`.
3. **Looping**: We use a for loop to remove the first element and append it to the end of the list.
4. **Sorting**: We sort the list in reverse order using `Collections.sort()`.
5. **Printing**: Finally, we print the top three elements of the sorted list. 

This Java method replicates the functionality of the original Python code while adhering to Java conventions.