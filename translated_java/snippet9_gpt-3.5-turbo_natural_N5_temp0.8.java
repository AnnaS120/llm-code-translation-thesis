Here is the converted Java code from the provided Python code snippet:

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
            System.out.println(height[height.length - 1 - i]);
        }
    }
}
```

This Java code snippet should compile successfully and produce the same output as the original Python code.