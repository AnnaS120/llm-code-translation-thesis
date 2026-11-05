Below is the Java equivalent of the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        List<Integer> lists = new ArrayList<>();
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
- **Imports:** We import `ArrayList` and `Collections` to utilize dynamic arrays and sorting.
- **Variables Declaration:** We declare integer variables similar to the Python version.
- **List Initialization:** We create a list and add the values using `add()`.
- **Loop for Pop and Append:** We use a for loop to remove an element at index `N12` and append it to the end of the list.
- **Sorting:** We use `Collections.sort()` to sort the list in descending order.
- **Printing the Top Elements:** Finally, we print the top `N13` elements from the sorted list using a loop.