Here’s how you can rewrite the provided Python function as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        
        List<Integer> height = new ArrayList<>();
        
        // Populating the height list and removing elements from data
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));
        }
        
        // Sorting the height list in descending order
        Collections.sort(height, Collections.reverseOrder());
        
        // Printing the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import necessary classes from `java.util` for list operations.
2. **Main Class and Method**: The code is placed inside a `Main` class with a `main` method, which is the entry point for Java applications.
3. **List Initialization**: We use `ArrayList` to store the initial data and the heights.
4. **Populating the List**: We remove elements from the `data` list and add them to the `height` list in a loop.
5. **Sorting**: We sort the `height` list in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
6. **Printing**: We print the top three heights using a loop.

This Java method replicates the functionality of the provided Python code while adhering to Java conventions.