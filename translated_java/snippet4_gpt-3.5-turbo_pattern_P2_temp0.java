Here is the Java equivalent of the given Python function:

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

        for (int idx = 0; idx < 10; idx++) {
            int a = lists.remove(0);
            lists.add(a);
        }

        Collections.sort(lists, Collections.reverseOrder());

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(lists.get(idx));
        }
    }
}
```

This Java code performs the same operations as the given Python function.