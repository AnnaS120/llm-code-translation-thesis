Here is the equivalent Java code for the given Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mountList = {51, 95, 14, 69, 20, 99, 3, 37, 55, 87};
        Arrays.sort(mountList);
        for (int i = mountList.length - 1; i >= mountList.length - 3; i--) {
            System.out.println(mountList[i]);
        }
    }
}
```

In this Java code:
- We use an array of integers instead of a list.
- We sort the array in ascending order using `Arrays.sort()`.
- We iterate over the last three elements of the sorted array to print them in descending order.