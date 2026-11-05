Here is the equivalent Java code for the given Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {74, 43, 60, 53, 24, 35, 63, 32, 7, 71};
        int[] height = new int[10];
        
        for (int i = 0; i < 10; i++) {
            height[i] = data[i];
        }
        
        Arrays.sort(height);
        for (int i = 0; i < 3; i++) {
            System.out.println(height[9 - i]);
        }
    }
}
```

This Java code does the same thing as the given Python function: it takes the first 10 elements of the `data` array, sorts them in descending order, and then prints the top 3 numbers.