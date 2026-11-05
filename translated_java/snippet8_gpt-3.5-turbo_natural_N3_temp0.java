Sure, here is the provided Python function rewritten as a Java method:

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

In this Java version, an ArrayList is used to store the elements instead of a list. The elements are added to the ArrayList using the `add` method, removed using the `remove` method, sorted using `Collections.sort`, and reversed using `Collections.reverse`. Finally, the elements are printed using a for loop and `System.out.println`.