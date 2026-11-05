```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 64;
        int N2 = 55;
        int N3 = 31;
        int N4 = 34;
        int N5 = 51;
        int N6 = 36;
        int N7 = 10;
        int N8 = 12;
        int N9 = 66;
        int N10 = 82;
        int N11 = 0;
        int N12 = 4;
        int N13 = 3;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(N4);
        ans.add(N8);
        ans.add(N5);
        ans.add(N1);
        ans.add(N10);
        ans.add(N2);
        ans.add(N3);
        ans.add(N6);
        ans.add(N9);
        ans.add(N12);

        for (int i = N11; i < N7; i++) {
            ans.add(ans.remove(N11));
        }
        Collections.sort(ans, Collections.reverseOrder());

        for (int i = N11; i < N13; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```