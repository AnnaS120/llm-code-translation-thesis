Here is the Java equivalent code for the given Python code:

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

In this Java code:
- We use an array of integers instead of a list.
- We use the `Arrays.sort` method to sort the array in ascending order.
- We iterate over the last 3 elements of the sorted array to print the top 3 values.