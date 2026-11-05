Here’s how you can rewrite the provided Python function as a Java method, adhering to Java syntax and conventions:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {3, 54, 57, 45, 93, 98, 80, 100, 58, 96};
        rearrangeAndPrintTopThree(arr);
    }

    public static void rearrangeAndPrintTopThree(Integer[] arr) {
        // Perform the rotations
        for (int i = 0; i < 10; i++) {
            // Move the first element to the end of the array
            int firstElement = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstElement;
        }

        // Sort the array in reverse order
        Arrays.sort(arr, Collections.reverseOrder());

        // Print the top three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

### Explanation:
1. **Imports**:
   - `Arrays` and `Collections` are imported to use sorting methods.

2. **Main Method**:
   - The `main` method initializes the array and calls the `rearrangeAndPrintTopThree` method.

3. **Rearranging Elements**:
   - A loop is used to rotate the array by popping the first element and appending it to the end.

4. **Sorting**:
   - The array is sorted in reverse order using `Arrays.sort` combined with `Collections.reverseOrder()`.

5. **Printing**:
   - The top three elements are printed using a loop. 

This Java method performs the same functionality as the original Python code.