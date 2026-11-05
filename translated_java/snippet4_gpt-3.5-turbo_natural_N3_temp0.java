Sure, here is the provided Python function rewritten as a Java method:

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

In this Java method, we use an `ArrayList` to store the list of integers, and we use the `Collections` class to sort the list in reverse order. The `remove` method is used to remove the first element from the list, and the `add` method is used to append the element at the end of the list. Finally, we use a loop to print the top 3 elements of the sorted list.