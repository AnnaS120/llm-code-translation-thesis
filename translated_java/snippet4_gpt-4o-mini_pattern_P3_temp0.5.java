Sure! Here's the equivalent Java code for the provided Python function:

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

### Explanation:
1. **Imports**: We import `ArrayList` and `Collections` for list operations and sorting.
2. **Variable Declaration**: We declare and initialize the variables as in the Python code.
3. **ArrayList Creation**: We create an `ArrayList` to hold the values.
4. **Loop for Modification**: We use a loop to pop the first element and append it to the end of the list.
5. **Sorting**: We sort the list in descending order using `Collections.sort`.
6. **Output**: We print the first three elements of the sorted list.