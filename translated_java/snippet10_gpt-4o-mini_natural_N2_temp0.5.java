Certainly! Below is the equivalent Java code for the provided Python code. The logic and structure have been preserved to match the original functionality.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        
        // Initialize the list with values
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);
        
        // Perform the operation of popping the first element and appending it
        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }
        
        // Sort the list
        Collections.sort(mt);
        
        // Print the last three elements (which are the largest after sorting)
        System.out.println(mt.get(9)); // 1st largest
        System.out.println(mt.get(8)); // 2nd largest
        System.out.println(mt.get(7)); // 3rd largest
    }
}
```

### Explanation:
1. **ArrayList Initialization**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Adding Elements**: The `Collections.addAll` method is used to add elements to the `ArrayList`.
3. **Looping**: The loop iterates 10 times to simulate the popping and appending of the first element.
4. **Sorting**: The `Collections.sort` method sorts the list in ascending order.
5. **Printing Elements**: We use `get(index)` to access the elements in the sorted list, where `index` corresponds to the desired largest values.

This Java code will produce the same output as the original Python code.