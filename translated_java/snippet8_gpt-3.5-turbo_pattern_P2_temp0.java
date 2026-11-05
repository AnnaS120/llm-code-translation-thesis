Here is the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        m.add(36);
        m.add(72);
        m.add(97);
        m.add(98);
        m.add(95);
        m.add(97);
        m.add(2);
        m.add(12);
        m.add(90);
        m.add(11);

        for (int idx = 0; idx < 10; idx++) {
            int x = m.remove(0);
            m.add(x);
        }

        Collections.sort(m);
        Collections.reverse(m);

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(m.get(idx));
        }
    }
}
```

This Java code performs the same operations as the given Python function and prints the top 3 elements of the list after sorting and reversing it.