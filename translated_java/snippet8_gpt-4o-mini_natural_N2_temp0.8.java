Below is the equivalent Java code that replicates the logic and structure of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Remove the first element and store it in x
            m.add(x); // Append x to the end of the list
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
- We use `ArrayList<Integer>` to dynamically manage the list of integers.
- `Collections.addAll()` is used to initialize the list with the given elements.
- The loop removes the first element, stores it in `x`, and appends it to the end of the list.
- After the loop, `Collections.sort()` sorts the list, and `Collections.reverse()` reverses it.
- Finally, we print the first three elements of the modified list.