Here is the translation of the given Python code into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 50;
        int N2 = 71;
        int N3 = 40;
        int N4 = 33;
        int N5 = 83;
        int N6 = 10;
        int N7 = 90;
        int N8 = 12;
        int N9 = 98;
        int N10 = 66;
        int N11 = 68;
        int N12 = 0;
        int N13 = 3;
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(N9);
        lists.add(N1);
        lists.add(N7);
        lists.add(N5);
        lists.add(N4);
        lists.add(N3);
        lists.add(N2);
        lists.add(N8);
        lists.add(N11);
        lists.add(N10);

        for (int i = 0; i < N6; i++) {
            int a = lists.remove(N12);
            lists.add(a);
        }
        Collections.sort(lists, Collections.reverseOrder());

        for (int i = 0; i < N13; i++) {
            System.out.println(lists.get(i));
        }
    }
}
```

In this Java code, the provided Python code is translated into Java. The Java code initializes the variables N1 to N13, creates an ArrayList `lists`, performs the same operations as the Python code, and prints the top N13 elements of the sorted `lists` ArrayList in reverse order.