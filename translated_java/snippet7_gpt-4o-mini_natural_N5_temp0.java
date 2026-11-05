Here’s how you can convert the provided Python code into Java code that compiles successfully. The Java code will use appropriate data types and method structure:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};

        // Sort the array in descending order
        Arrays.sort(mountList, Collections.reverseOrder());

        // Print the top 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList[i]);
        }
    }
}
```

### Explanation:
1. **Array Initialization**: In Java, we use an array of `Integer` objects to hold the values.
2. **Sorting**: The `Arrays.sort()` method is used with `Collections.reverseOrder()` to sort the array in descending order.
3. **Looping and Printing**: A simple `for` loop is used to print the first three elements of the sorted array.

This Java code will compile and run, producing the same output as the original Python code.