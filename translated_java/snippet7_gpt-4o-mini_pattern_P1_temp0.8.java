Here’s how you can translate the given Python function into Java:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the array and convert it to Integer array
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

1. **Array Initialization**: In Python, you create a list directly. In Java, we define an array of `Integer` objects.
   
2. **Sorting**: The `Arrays.sort()` function is used with `Collections.reverseOrder()` to sort the array in descending order.

3. **Printing the Top 3 Elements**: A simple loop iterates through the first three elements of the sorted array to print them.

This Java code mimics the functionality of the original Python code while adhering to Java syntax and conventions.