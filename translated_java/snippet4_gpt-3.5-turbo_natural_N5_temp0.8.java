Here is the Java code equivalent to the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(98);
        lists.add(50);
        lists.add(90);
        lists.add(83);
        lists.add(33);
        lists.add(40);
        lists.add(71);
        lists.add(12);
        lists.add(68);
        lists.add(66);

        for (int i = 0; i < 10; i++) {
            int a = lists.remove(0);
            lists.add(a);
        }

        Collections.sort(lists, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(i));
        }
    }
}
```

In this Java code:
- We are using an `ArrayList` to store the list of integers.
- We initialize the list with the given values.
- We iterate over the list, popping the first element and then appending it back to simulate the rotation.
- We use `Collections.sort` with `Collections.reverseOrder()` to sort the list in descending order.
- Finally, we print the first three elements of the sorted list.