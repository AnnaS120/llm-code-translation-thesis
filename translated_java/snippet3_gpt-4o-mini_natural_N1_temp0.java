Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);

        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(ans, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Collections.addAll**: This method is used to add multiple elements to the list.
3. **Loop**: The loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: `Collections.sort` is used to sort the list in reverse order.
5. **Printing**: Finally, we print the first three elements of the sorted list. 

Make sure to import the necessary classes when using this code in a Java environment.