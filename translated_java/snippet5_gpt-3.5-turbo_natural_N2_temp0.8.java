```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] heights = {69, 40, 25, 17, 40, 30, 65, 75, 46, 4};
        
        Arrays.sort(heights, Collections.reverseOrder());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
    }
}
```