Here is the Java equivalent of the given Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        Arrays.sort(heights);
        int[] topThree = new int[3];
        for (int i = 0; i < 3; i++) {
            topThree[i] = heights[heights.length - 1 - i];
        }
        System.out.println(String.join("\n", Arrays.toString(topThree)));
    }
}
```