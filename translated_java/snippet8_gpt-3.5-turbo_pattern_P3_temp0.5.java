Here is the Java equivalent of the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 95;
        int N2 = 97;
        int N3 = 11;
        int N4 = 36;
        int N5 = 10;
        int N6 = 90;
        int N7 = 12;
        int N8 = 98;
        int N9 = 72;
        int N10 = 0;
        int N11 = 2;
        int N12 = 3;

        ArrayList<Integer> m = new ArrayList<>();
        m.add(N4);
        m.add(N9);
        m.add(N2);
        m.add(N8);
        m.add(N1);
        m.add(N2);
        m.add(N11);
        m.add(N7);
        m.add(N6);
        m.add(N3);

        for (int i = 0; i < N5; i++) {
            int x = m.remove(N10);
            m.add(x);
        }

        Collections.sort(m, Collections.reverseOrder());

        for (int i = N10; i < N12; i++) {
            System.out.println(m.get(i));
        }
    }
}
```