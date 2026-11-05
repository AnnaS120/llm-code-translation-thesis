Here is the translation of the Python code into Java:

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

In this Java code, we first create a list of integers `mountList` and sort it in descending order. Then, we iterate over the first three elements of the sorted list and print them.