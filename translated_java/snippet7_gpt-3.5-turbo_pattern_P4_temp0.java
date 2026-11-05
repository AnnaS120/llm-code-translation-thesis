Here is the equivalent Java code for the given Python function:

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

This Java code performs the same functionality as the given Python code, sorting the list in descending order and then printing the first three elements of the sorted list.