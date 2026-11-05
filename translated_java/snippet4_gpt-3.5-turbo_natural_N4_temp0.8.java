Sure, here is the Java implementation of the provided Python snippet:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
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

This Java code mimics the behavior of the provided Python snippet by performing the same operations on the list of integers and printing the top 3 elements after sorting in descending order.