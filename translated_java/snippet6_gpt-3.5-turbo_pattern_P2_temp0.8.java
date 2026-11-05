Sure, here is the translated Java code:

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

        for (int idx = 0; idx < 10; idx++) {
            int t = list.remove(0);
            list.add(t);
        }

        Collections.sort(list, Collections.reverseOrder());
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(list.get(idx));
        }
    }
}
```