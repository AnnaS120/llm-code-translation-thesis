Here’s a translation of the provided Python code into Java:

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
1. **ArrayList**: In Java, we use `ArrayList` to hold the integers, similar to Python's list.
2. **Adding Elements**: `Collections.addAll` is used to add multiple elements to the `ArrayList`.
3. **Loop**: The `for` loop iterates 10 times, removing the first element and adding it to the end of the list using `ans.remove(0)` and `ans.add(...)`.
4. **Sorting**: `Collections.sort` is used to sort the list in reverse order.
5. **Printing**: Finally, we print the first three elements using `System.out.println`. 

This Java code achieves the same functionality as the original Python code.