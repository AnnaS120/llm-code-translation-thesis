Here’s how you can rewrite the provided Python function as a Java method, following correct Java syntax and conventions:

```java
import java.util.Arrays;
import java.util.Collections;

public class MountListExample {
    public static void main(String[] args) {
        printTopThreeMounts();
    }

    public static void printTopThreeMounts() {
        Integer[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        
        // Sort the array in descending order
        Arrays.sort(mountList, Collections.reverseOrder());
        
        // Print the top three elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList[i]);
        }
    }
}
```

### Explanation:
1. **Imports**: We import `Arrays` and `Collections` for sorting.
2. **Main Method**: The `main` method is the entry point of the Java program.
3. **Array Initialization**: We use an `Integer[]` array to hold the values.
4. **Sorting**: We sort the array in descending order using `Arrays.sort()` with `Collections.reverseOrder()`.
5. **Printing**: We loop through the first three elements of the sorted array and print them.