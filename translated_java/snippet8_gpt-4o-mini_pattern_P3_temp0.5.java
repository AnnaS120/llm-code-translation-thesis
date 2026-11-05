Here's the equivalent Java code for the provided Python function:

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
            int x = m.remove(N10); // pop from index 0
            m.add(x); // append to the end
        }

        Collections.sort(m);
        Collections.reverse(m);

        for (int i = N10; i < N12; i++) {
            System.out.println(m.get(i));
        }
    }
}
```

### Explanation:
1. **Data Structure**: The Python list `m` is replaced with an `ArrayList<Integer>` in Java.
2. **Pop and Append**: The `pop` operation in Python is translated to `remove` in Java, which removes an element at a specified index and returns it.
3. **Sorting and Reversing**: The `sort()` and `reverse()` methods from Python are replaced with `Collections.sort()` and `Collections.reverse()` in Java.
4. **Printing**: The printing mechanism in Python is replaced with `System.out.println()` in Java.

### Note:
The loop that prints elements from `N10` to `N12` will only print one element (the element at index 0) since `N12` is 3 and `N10` is 0. If you intended to print more elements, you might need to adjust the loop range based on your requirements.