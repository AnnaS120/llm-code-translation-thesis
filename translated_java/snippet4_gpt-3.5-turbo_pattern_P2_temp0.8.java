Here is the equivalent Java code for the given Python function:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new java.util.ArrayList<>(Arrays.asList(98, 50, 90, 83, 33, 40, 71, 12, 68, 66));

        for (int idx = 0; idx < 10; idx++) {
            int a = lists.remove(0);
            lists.add(a);
        }

        Collections.sort(lists, Collections.reverseOrder());
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(lists.get(idx));
        }
    }
}
``` 

In this Java code, the initial list is created using `ArrayList` and `Arrays.asList()`. The elements are manipulated similarly to the Python function, utilizing the `remove()` and `add()` methods. The list is then sorted in reverse order using `Collections.sort()` with `Collections.reverseOrder()`. Finally, the top 3 elements are printed to the console using `get()`.