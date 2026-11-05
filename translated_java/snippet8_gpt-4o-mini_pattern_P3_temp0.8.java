Here is the translated Python function into Java:

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
            int x = m.remove(N10); // Pop from index 0
            m.add(x); // Add the popped element to the end of the list
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
1. **Data Types**: Java uses static typing, so variables are explicitly declared with their types.
2. **ArrayList**: An `ArrayList` is used in place of Python's list to handle dynamic sizing.
3. **Looping**: The `for` loops in Java use a slightly different syntax, but the functionality remains the same.
4. **Collections Utility**: The `Collections.sort()` and `Collections.reverse()` methods are used to sort and reverse the list, respectively.
5. **Printing**: The `System.out.println` method is used to print the elements.

Make sure to compile and run this Java code in a suitable environment to see the output.