Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 71;
        int N2 = 43;
        int N3 = 63;
        int N4 = 60;
        int N5 = 35;
        int N6 = 10;
        int N7 = 24;
        int N8 = 74;
        int N9 = 32;
        int N10 = 53;
        int N11 = 0;
        int N12 = 7;
        int N13 = 3;

        ArrayList<Integer> data = new ArrayList<>();
        data.add(N8);
        data.add(N2);
        data.add(N4);
        data.add(N10);
        data.add(N7);
        data.add(N5);
        data.add(N3);
        data.add(N9);
        data.add(N12);
        data.add(N1);

        // Create a list to hold the heights
        ArrayList<Integer> height = new ArrayList<>();

        // Pop elements from data and add to height
        for (int i = 0; i < N6; i++) {
            height.add(data.remove(N11));
        }

        // Sort the heights in reverse order
        Collections.sort(height, Collections.reverseOrder());

        // Print the first N13 elements
        for (int i = 0; i < N13; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Data Structure**: In Java, we use `ArrayList` to store the integers, similar to Python's list.
2. **Pop Operation**: The `remove` method is used to remove an element at a specific index, which is equivalent to `pop` in Python.
3. **Sorting**: The `Collections.sort` method is used to sort the list in reverse order.
4. **Printing**: The `System.out.println` method is used to print the elements, similar to Python's `print` function. 

This Java code replicates the functionality of the original Python code.