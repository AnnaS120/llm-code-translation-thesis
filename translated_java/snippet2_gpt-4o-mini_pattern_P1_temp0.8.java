Sure! Below is the Java translation of the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        int[] initialValues = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        
        // Fill the ArrayList with initial values
        for (int value : initialValues) {
            h.add(value);
        }

        int N = 10;

        // Rotate the list N times
        for (int count = 0; count < N; count++) {
            // Remove the first element and add it to the end
            h.add(h.remove(0));
        }

        // Sort the list in reverse order
        Collections.sort(h, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation:
1. **Initialization**: An `ArrayList` is created to hold the integers.
2. **Rotation**: Similar to the Python code, the first element is removed and added to the end of the list in a loop for `N` iterations.
3. **Sorting**: The `Collections.sort()` method is used to sort the list in reverse order.
4. **Output**: The top 3 elements from the sorted list are printed. 

This Java code replicates the functionality of the provided Python code.