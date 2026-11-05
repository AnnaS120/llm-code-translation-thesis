Here's the equivalent Java code for the provided Python function:

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
            int a = lists.remove(N12); // pop from index 0
            lists.add(a); // append to the end
        }

        Collections.sort(lists, Collections.reverseOrder()); // sort in reverse order

        for (int i = 0; i < N13; i++) {
            System.out.println(lists.get(i)); // print the first N13 elements
        }
    }
}
```

### Explanation:
1. **Variable Declaration**: The integers are declared and initialized similarly to Python.
2. **ArrayList**: Java's `ArrayList` is used to store the integers, similar to Python's list.
3. **Loop for Pop and Append**: The loop iterates `N6` times, removing the first element (index `0`) and appending it to the end of the list.
4. **Sorting**: The `Collections.sort` method is used to sort the list in reverse order.
5. **Printing**: The loop prints the first `N13` elements of the sorted list.

This Java code replicates the functionality of the original Python code.