Here's the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Rotate the list 10 times
        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        // Sort in descending order
        Collections.sort(ans, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used instead of a list in Python.
2. **Collections.addAll**: To initialize the list with values.
3. **Loop**: The for loop mimics the Python loop to rotate the list.
4. **remove(0)**: Removes the first element, similar to `pop(0)` in Python.
5. **Collections.sort**: Sorts the list in descending order.
6. **System.out.println**: Prints the top three elements from the sorted list.