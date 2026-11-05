Sure, here is the provided Python function rewritten as a Java method:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(74);
        data.add(43);
        data.add(60);
        data.add(53);
        data.add(24);
        data.add(35);
        data.add(63);
        data.add(32);
        data.add(7);
        data.add(71);

        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));
        }

        Collections.sort(height, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

In this Java method, we use ArrayList to store the data and height values. We populate the height array with the first 10 elements from the data array, sort it in reverse order, and then print the top 3 values from the sorted height array.