Here is the translated Java code for the given Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        Arrays.sort(heights);
        for(int i = heights.length - 1; i >= heights.length - 3; i--) {
            System.out.print(heights[i]);
            if(i > heights.length - 3 + 1) {
                System.out.print("count");
            }
        }
    }
}
```

This Java code will achieve the same functionality as the given Python code.