Here is the equivalent Java code for the given Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N1 = 65;
        int N2 = 40;
        int N3 = 75;
        int N4 = 46;
        int N5 = 17;
        int N6 = 25;
        int N7 = 30;
        int N8 = 69;
        int N9 = 4;
        int N10 = 3;

        int[] heights = {N8, N2, N6, N5, N2, N7, N1, N3, N4, N9};
        Arrays.sort(heights);
        for (int i = heights.length - 1; i >= heights.length - N10; i--) {
            System.out.println(heights[i]);
        }
    }
}
```

This Java code performs the same functionality as the given Python code by sorting the heights array in descending order and then printing the top N10 elements.