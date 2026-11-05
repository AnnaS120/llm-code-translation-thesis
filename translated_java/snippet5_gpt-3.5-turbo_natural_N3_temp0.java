Sure, here is the provided Python function rewritten as a Java method:

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

In this Java method, we first import the `Arrays` class to use the `sort` method. We then define an array `heights` with the given values. We sort the array in ascending order using `Arrays.sort(heights)`. Finally, we iterate over the last 3 elements of the sorted array and print them in descending order.