Here is the equivalent Java code for the given Python function:

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
        for (int idx = 0; idx < 10; idx++) {
            height.add(data.remove(0));
        }

        Collections.sort(height, Collections.reverseOrder());

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(height.get(idx));
        }
    }
}
```

This Java code performs the same operations as the given Python function, including creating the data list, extracting the first 10 elements into the height list, sorting the height list in descending order, and printing the top 3 elements.