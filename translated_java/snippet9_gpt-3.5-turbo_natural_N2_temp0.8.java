Here is the equivalent Java code for the given Python code:

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

In the Java code:

- We initialize an array `data` with the given values.
- We create an empty array `height` to store the values after popping from `data`.
- We then loop through the `data` array to pop values and store them in the `height` array.
- We sort the `height` array in ascending order using `Arrays.sort()`.
- Finally, we loop from the end of the sorted `height` array to print the top 3 values.