Here's the translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        // Create a height list and populate it
        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));  // Remove the first element and add it to height
        }

        // Sort the height list in reverse order
        Collections.sort(height, Collections.reverseOrder());

        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: Used to store the data and height lists, similar to Python's list.
2. **Collections.addAll**: Used to initialize the `data` list with values.
3. **remove(0)**: This method removes the first element from the list, similar to `pop(0)` in Python.
4. **Collections.sort**: Used to sort the list in reverse order.
5. **System.out.println**: Used to print the top three heights. 

This Java code replicates the functionality of the original Python code.