Here’s how you can rewrite the provided Python function as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Collections.addAll(data, 74, 43, 60, 53, 24, 35, 63, 32, 7, 71);
        printTopThreeHeights(data);
    }

    public static void printTopThreeHeights(List<Integer> data) {
        List<Integer> height = new ArrayList<>();
        
        // Populating the height list
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));
        }
        
        // Sorting the heights in descending order
        Collections.sort(height, Collections.reverseOrder());
        
        // Printing the top three heights
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Imports**: We import necessary classes from the Java Collections Framework.
2. **Main Class**: The code is encapsulated in a `Main` class, which is standard in Java.
3. **Main Method**: The `main` method serves as the entry point for the program.
4. **List Initialization**: We use an `ArrayList` to store the data.
5. **Populating Heights**: We use a loop to remove elements from the `data` list and add them to the `height` list.
6. **Sorting**: We sort the `height` list in descending order using `Collections.sort()` with `Collections.reverseOrder()`.
7. **Printing**: Finally, we print the top three heights using a loop. 

This Java method replicates the functionality of the original Python code while adhering to Java conventions.