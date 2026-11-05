Here is the equivalent Java implementation of the given Python snippet:

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

This Java code snippet replicates the behavior of the original Python code by creating ArrayLists to store the data, heights, and sorted heights. It then populates the height ArrayList with the first 10 elements from the data ArrayList, sorts the height ArrayList in descending order, and prints the top 3 elements.