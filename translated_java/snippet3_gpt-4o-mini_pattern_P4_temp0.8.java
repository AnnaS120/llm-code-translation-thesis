Here's the translation of the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        // Loop iteration
        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Pop the first element and append it to the end
        }

        // Sort in reverse order
        Collections.sort(ans, Collections.reverseOrder());

        // Loop iteration to print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
- We use `ArrayList<Integer>` to create a list similar to Python's list.
- `Collections.addAll` is used to initialize the list with values.
- The loop iterates 10 times, removing the first element and adding it back to the end of the list.
- `Collections.sort` is used to sort the list in reverse order.
- Finally, it prints the first three elements from the sorted list.