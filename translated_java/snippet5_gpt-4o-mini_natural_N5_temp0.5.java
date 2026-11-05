Here’s how you can convert the provided Python code to Java, ensuring it compiles successfully and uses appropriate data types and method structures.

### Python Code
```python
heights = [69, 40, 25, 17, 40, 30, 65, 75, 46, 4]
heights.sort(reverse=True)
print(("\n".join(map(str, heights[:3]))))
```

### Java Code
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        
        // Sort the array in descending order
        Arrays.sort(heights);
        reverseArray(heights);
        
        // Print the top 3 heights
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
    }
    
    // Method to reverse the sorted array
    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
```

### Explanation
1. **Array Declaration**: The heights are declared as an array of integers.
2. **Sorting**: The `Arrays.sort()` method is used to sort the array in ascending order, followed by a custom method to reverse it for descending order.
3. **Printing**: A simple loop is used to print the top three heights.
4. **Reverse Method**: A helper method `reverseArray` is defined to reverse the sorted array in place.

This Java code replicates the functionality of the original Python code while adhering to Java's syntax and conventions.