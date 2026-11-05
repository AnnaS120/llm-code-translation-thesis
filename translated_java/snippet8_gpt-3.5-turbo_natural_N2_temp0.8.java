Sure, here is the equivalent Java code for the given Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

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

This Java code performs the same operations as the original Python code and prints the top 3 elements after sorting and reversing the list `m`.