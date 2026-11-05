Here is the equivalent Java code for the given Python code:

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

In this Java code:
- We use an array of integers to store the heights.
- We use `Arrays.sort()` to sort the heights in ascending order.
- We then iterate over the last 3 elements of the sorted array and print them out.