Here is the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(84);
        list.add(47);
        list.add(46);
        list.add(100);
        list.add(92);
        list.add(95);
        list.add(39);
        list.add(64);
        list.add(50);
        list.add(5);

        for (int i = 0; i < 10; i++) {
            int t = list.remove(0);
            list.add(t);
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
```

In this Java code, an ArrayList is used to store the list of integers. The ArrayList's `remove` method is used to pop the first element, and the `add` method is used to append the popped element back to the list. The `Collections.sort` method is used to sort the list in descending order, and then the first three elements are printed using a loop.