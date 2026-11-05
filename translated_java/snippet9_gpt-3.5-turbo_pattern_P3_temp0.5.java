Here is the Java equivalent of the given Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 71;
        int N2 = 43;
        int N3 = 63;
        int N4 = 60;
        int N5 = 35;
        int N6 = 10;
        int N7 = 24;
        int N8 = 74;
        int N9 = 32;
        int N10 = 53;
        int N11 = 0;
        int N12 = 7;
        int N13 = 3;

        ArrayList<Integer> data = new ArrayList<>();
        data.add(N8);
        data.add(N2);
        data.add(N4);
        data.add(N10);
        data.add(N7);
        data.add(N5);
        data.add(N3);
        data.add(N9);
        data.add(N12);
        data.add(N1);

        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < N6; i++) {
            height.add(data.remove(N11));
        }

        Collections.sort(height, Collections.reverseOrder());

        for (int i = 0; i < N13; i++) {
            System.out.println(height.get(i));
        }
    }
}
```