Here's how you can rewrite the provided Python function as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.addAll(ans, 34, 12, 51, 64, 82, 55, 31, 36, 66, 4);
        
        // Rotate the list
        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0)); // Remove the first element and add it to the end
        }
        
        // Sort in reverse order
        Collections.sort(ans, Collections.reverseOrder());
        
        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` and `Collections` for list manipulation.
2. **ArrayList Initialization**: We use `Collections.addAll` to initialize the `ArrayList`.
3. **Loop for Rotation**: The `for` loop is used to move the first element to the end of the list.
4. **Sorting**: We sort the list in reverse order using `Collections.sort`.
5. **Printing**: We print the first three elements of the sorted list. 

This Java method achieves the same functionality as the provided Python code.