Here's the translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 3, 54, 57, 45, 93, 98, 80, 100, 58, 96);

        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList Creation**: We use an `ArrayList<Integer>` to store integers, similar to the Python list.
2. **Adding Elements**: We use `Collections.addAll()` to add the elements to the `ArrayList`.
3. **Loop for Reordering**: The loop iterates 10 times, removing the first element and appending it to the end of the list.
4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing the Top 3 Elements**: Finally, we print the first three elements of the sorted list.

Make sure to run this code in a Java environment to see the output.