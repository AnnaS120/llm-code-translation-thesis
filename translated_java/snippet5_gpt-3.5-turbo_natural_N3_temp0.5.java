Sure, here is the equivalent Java method for the provided Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        Arrays.sort(heights);
        for (int i = heights.length - 1; i >= heights.length - 3; i--) {
            System.out.println(heights[i]);
        }
    }
}
```

This Java method will sort the array in ascending order and then print the top 3 heights in descending order.