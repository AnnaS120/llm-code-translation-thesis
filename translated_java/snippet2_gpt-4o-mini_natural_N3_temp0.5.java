Here's the provided Python function rewritten as a Java method, following correct Java syntax and conventions:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        // Rotate the array
        for (int n = 0; n < N; n++) {
            int firstElement = h[0];
            for (int i = 0; i < h.length - 1; i++) {
                h[i] = h[i + 1];
            }
            h[h.length - 1] = firstElement;
        }

        // Convert array to a list for sorting
        ArrayList<Integer> hList = new ArrayList<>();
        for (int value : h) {
            hList.add(value);
        }

        // Sort the list in reverse order
        Collections.sort(hList, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(hList.get(i));
        }
    }
}
```

### Explanation:
1. **Array Initialization**: The array `h` is initialized with the given values.
2. **Rotation Logic**: A loop is used to rotate the elements of the array `N` times.
3. **Sorting**: The array is converted to an `ArrayList` to facilitate sorting, which is done in reverse order using `Collections.sort()`.
4. **Output**: The top three elements are printed to the console. 

Make sure to run this code in a Java environment to see the results!