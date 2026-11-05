Here's the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 98;
        int N2 = 17;
        int N3 = 93;
        int N4 = 10;
        int N5 = 13;
        int N6 = 84;
        int N7 = 37;
        int N8 = 66;
        int N9 = 70;
        int N10 = 72;
        int N11 = 0;
        int N12 = 1;
        int N13 = 8;
        int N14 = 3;

        ArrayList<Integer> h = new ArrayList<>();
        h.add(N8);
        h.add(N5);
        h.add(N12);
        h.add(N10);
        h.add(N6);
        h.add(N3);
        h.add(N9);
        h.add(N7);
        h.add(N2);
        h.add(N1);

        int N = N4;

        for (int n = 0; n < N; n++) {
            h.add(h.remove(N11));
        }

        Collections.sort(h, Collections.reverseOrder());

        for (int i = 0; i < N14; i++) {
            System.out.println(h.get(i));
        }
    }
}
```

### Explanation:
1. **Variable Declaration**: The integer variables are declared and initialized similarly to Python.
2. **ArrayList**: An `ArrayList` is used to store the values, as it allows dynamic resizing and provides methods like `add()` and `remove()`.
3. **Looping**: The `for` loops are translated directly, with the syntax adjusted for Java.
4. **Sorting**: The `Collections.sort()` method is used to sort the list in reverse order.
5. **Printing**: The `System.out.println()` method is used to print the values, similar to Python's `print()` function. 

This Java code replicates the functionality of the original Python code.