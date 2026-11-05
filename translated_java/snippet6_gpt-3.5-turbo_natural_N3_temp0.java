Sure, here is the provided Python function rewritten as a Java method:

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

In this Java method, an ArrayList is used to store the integers, and the Collections class is used to sort the list in reverse order. The for loops are used to iterate over the list and print the top 3 elements.