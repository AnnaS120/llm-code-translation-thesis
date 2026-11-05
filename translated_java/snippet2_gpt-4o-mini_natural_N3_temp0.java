Here’s the provided Python function rewritten as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        // Convert array to ArrayList for easier manipulation
        ArrayList<Integer> hList = new ArrayList<>();
        for (int num : h) {
            hList.add(num);
        }

        // Rotate the list N times
        for (int n = 0; n < N; n++) {
            hList.add(hList.remove(0));
        }

        // Sort the list in reverse order
        Collections.sort(hList, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(hList.get(i));
        }
    }
}
```

### Explanation:
1. **Array to ArrayList**: The original Python list is converted to an `ArrayList` for easier manipulation.
2. **Rotation**: The `remove(0)` method is used to remove the first element and `add()` is used to append it to the end of the list.
3. **Sorting**: The `Collections.sort()` method is used to sort the list in reverse order.
4. **Printing**: The top three elements are printed using a loop. 

This Java method replicates the functionality of the original Python code while adhering to Java conventions.