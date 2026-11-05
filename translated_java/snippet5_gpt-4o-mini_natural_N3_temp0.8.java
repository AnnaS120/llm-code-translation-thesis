Here's how you can rewrite the provided Python function in Java, following the correct Java syntax and conventions:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        Arrays.sort(heights, Collections.reverseOrder());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
    }
}
```

### Explanation:

1. **Array Declaration**: In Java, we declare the array as `Integer[]` since we are sorting objects.
2. **Sorting**: We use `Arrays.sort` with `Collections.reverseOrder()` to sort the array in descending order.
3. **Printing**: We loop through the first three elements of the sorted array and print each one. 

This Java code will achieve the same result as the original Python code.