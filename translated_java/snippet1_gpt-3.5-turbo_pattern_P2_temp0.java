Here is the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(54);
        arr.add(57);
        arr.add(45);
        arr.add(93);
        arr.add(98);
        arr.add(80);
        arr.add(100);
        arr.add(58);
        arr.add(96);

        for (int idx = 0; idx < 10; idx++) {
            arr.add(arr.remove(0));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(arr.get(idx));
        }
    }
}
```

This Java code performs the same operations as the given Python function.