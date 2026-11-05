Here is the Java code equivalent to the provided Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        Arrays.sort(heights);
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[heights.length - 1 - i]);
        }
    }
}
```

In this Java code:
- We use an integer array `heights` to store the heights.
- We use `Arrays.sort(heights)` to sort the heights in ascending order.
- We then iterate over the last 3 elements of the sorted array to print the top 3 heights.