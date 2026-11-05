Here’s how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        List<Integer> data = new ArrayList<>();
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

        List<Integer> height = new ArrayList<>();
        
        // Populating height list based on N6
        for (int i = 0; i < N6; i++) {
            height.add(data.remove(N11));
        }

        // Sorting in reverse order
        Collections.sort(height, Collections.reverseOrder());

        // Printing the top N13 elements
        for (int i = 0; i < N13; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

### Explanation:
1. **Variable Declaration:** The integer variables are declared just like in Python.
2. **List Initialization:** The `data` list is created using an `ArrayList` to store the integers.
3. **Populating `height`:** The `height` list is populated by removing elements from `data` based on the index `N11` (which is `0` in this case).
4. **Sorting:** The `height` list is sorted in reverse order using `Collections.sort()`.
5. **Printing:** The top `N13` elements are printed using a simple loop.

This Java code closely mirrors the logic of the original Python code while adhering to Java syntax and conventions.