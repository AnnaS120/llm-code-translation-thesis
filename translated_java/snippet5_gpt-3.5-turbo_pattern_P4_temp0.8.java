Here is the equivalent Java code for the given Python function:

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

In this Java code, we first define an array of integers 'heights', then sort the array in descending order using `Arrays.sort()` and `Collections.reverseOrder()`. Finally, we iterate through the first 3 elements of the sorted array and print them out.