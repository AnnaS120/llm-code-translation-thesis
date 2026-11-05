Here's the provided Python function rewritten as a Java method, following correct Java syntax and conventions:

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
1. **ArrayList**: Used `ArrayList<Integer>` to handle dynamic array behavior similar to Python's list.
2. **Collections.addAll**: This method is used to initialize the list with the given values.
3. **Loop**: The loop structure is similar to Python, but with Java's syntax.
4. **Collections.sort**: This is used to sort the list in reverse order.
5. **Printing**: `System.out.println` is used to print the top three elements.