Sure, here is the equivalent Java code for the given Python code:

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

This Java code will output the top 3 highest heights from the array in descending order.