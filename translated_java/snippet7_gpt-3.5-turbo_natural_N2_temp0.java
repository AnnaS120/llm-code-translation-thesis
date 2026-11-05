Sure, here is the equivalent Java code for the given Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        Arrays.sort(mountList);
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList[mountList.length - 1 - i]);
        }
    }
}
```

This Java code performs the same logic as the given Python code. It creates an array of integers, sorts it in ascending order, and then prints the top 3 elements in descending order.