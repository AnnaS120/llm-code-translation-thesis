Here's the equivalent Java code for the provided Python function:

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

### Explanation:
1. **Variable Declaration**: The integer variables are declared and initialized similarly to Python.
2. **ArrayList**: A dynamic list (`ArrayList`) is used to store the integers, similar to a Python list.
3. **Loop for Pop and Append**: The loop iterates from `N11` to `N8`, removing the first element and appending it to the end of the list.
4. **Sorting**: The list is sorted in reverse order using `Collections.sort()`.
5. **Printing**: The final loop prints the elements from the list based on the specified range.

Make sure to import the necessary classes (`ArrayList` and `Collections`) at the beginning of your Java file.