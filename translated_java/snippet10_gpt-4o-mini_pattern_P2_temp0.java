Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int idx = 0; idx < 10; idx++) {
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(mt); // Sort the list

        // Print the top three elements
        System.out.println(mt.get(9)); // 1st largest
        System.out.println(mt.get(8)); // 2nd largest
        System.out.println(mt.get(7)); // 3rd largest
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to store the integers, similar to the Python list.
2. **Adding Elements**: `Collections.addAll()` is used to initialize the list with values.
3. **Loop**: The loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: `Collections.sort()` sorts the list in ascending order.
5. **Printing**: We access the last three elements of the sorted list to print the top three largest values. 

Make sure to import the necessary classes when using this code in a Java environment.