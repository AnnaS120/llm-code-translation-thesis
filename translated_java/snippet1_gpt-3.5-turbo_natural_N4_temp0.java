Sure, here is the equivalent Java implementation of the given Python snippet:

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

        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

This Java code snippet replicates the behavior of the original Python code.