Here is the equivalent Java code for the given Python code:

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

In this Java code:
- We use ArrayList to store the data and height values.
- We use the `Collections.sort` method to sort the height array in descending order.
- We use a for loop to iterate over the first 3 elements of the sorted height array and print them.