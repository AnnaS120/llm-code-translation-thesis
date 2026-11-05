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

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0);
            m.add(x);
        }

        Collections.sort(m);
        Collections.reverse(m);

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i));
        }
    }
}
```