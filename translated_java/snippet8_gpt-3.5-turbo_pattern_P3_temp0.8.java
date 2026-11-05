Here is the equivalent Java code for the given Python function:

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
        int[] m = {N4, N9, N2, N8, N1, N2, N11, N7, N6, N3};
        ArrayList<Integer> mArr = new ArrayList<>();
        
        for (int num : m) {
            mArr.add(num);
        }
        
        for (int i = 0; i < N5; i++) {
            int x = mArr.remove(N10);
            mArr.add(x);
        }
        
        Collections.sort(mArr, Collections.reverseOrder());
        
        for (int i = N10; i < N12; i++) {
            System.out.println(mArr.get(i));
        }
    }
}
```

This Java code performs the same operations as the given Python function.