Here is the equivalent Java code for the given Python snippet:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mountList = Arrays.asList(51, 95, 14, 69, 20, 99, 3, 37, 55, 87);
        Collections.sort(mountList, Collections.reverseOrder());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

In this Java code:
- We create a List of integers `mountList` using `Arrays.asList()` method.
- We sort the list in descending order using `Collections.sort()` method with `Collections.reverseOrder()`.
- We iterate over the first 3 elements of the sorted list and print them out.