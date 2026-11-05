Here is the Java implementation equivalent to the provided Python snippet:

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

        ArrayList<Integer> sortedHeight = new ArrayList<>(height);
        Collections.sort(sortedHeight, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(sortedHeight.get(i));
        }
    }
}
```

This Java code snippet performs the same operations as the original Python code. It initializes the `data` list with the given values, extracts the first 10 elements from `data` to create the `height` list, sorts the `height` list in descending order, and then prints the first 3 elements of the sorted list.