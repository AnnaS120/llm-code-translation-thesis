Here is the equivalent Java code for the given Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        Arrays.sort(heights);
        int[] topThree = Arrays.copyOfRange(heights, heights.length - 3, heights.length);
        for (int i = 0; i < topThree.length; i++) {
            System.out.print(topThree[i]);
            if (i != topThree.length - 1) {
                System.out.print("\t");
            }
        }
    }
}
```

This Java code achieves the same functionality as the given Python code. It sorts the array of heights in ascending order and then prints the top three heights delimited by the tab character.