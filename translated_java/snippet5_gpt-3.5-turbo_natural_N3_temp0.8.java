Here is the provided Python function rewritten as a Java method:

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

This Java method sorts the array of heights in ascending order and then prints the top 3 heights in descending order.