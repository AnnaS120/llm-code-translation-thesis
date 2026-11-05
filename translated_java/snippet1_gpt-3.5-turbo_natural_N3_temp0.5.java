Sure, here is the provided Python function rewritten as a Java method:

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

In this Java version, an `ArrayList` is used to store the integer values and the `Collections` class is used to sort the list in reverse order. The `main` method corresponds to the original Python code.