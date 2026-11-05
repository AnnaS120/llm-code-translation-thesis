Here is the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 100;
        int N2 = 47;
        int N3 = 95;
        int N4 = 64;
        int N5 = 50;
        int N6 = 46;
        int N7 = 92;
        int N8 = 10;
        int N9 = 84;
        int N10 = 39;
        int N11 = 0;
        int N12 = 5;
        int N13 = 3;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(N9);
        list.add(N2);
        list.add(N6);
        list.add(N1);
        list.add(N7);
        list.add(N3);
        list.add(N10);
        list.add(N4);
        list.add(N5);
        list.add(N12);

        for (int i = N11; i < N8; i++) {
            int t = list.remove(N11);
            list.add(t);
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = N11; i < N13; i++) {
            System.out.println(list.get(i));
        }
    }
}
```