Here is the Java equivalent of the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
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

In this Java code, we use an ArrayList to store the integers, similar to a Python list. We iterate through the list, pop the first element, and then append it to the end of the list. After that, we sort the list in descending order and print the first three elements.