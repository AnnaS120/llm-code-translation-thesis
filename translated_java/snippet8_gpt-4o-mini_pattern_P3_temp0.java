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
            int x = m.remove(N10); // Remove the element at index N10 (0)
            m.add(x); // Append it to the end of the list
        }

        Collections.sort(m); // Sort the list
        Collections.reverse(m); // Reverse the list

        for (int i = N10; i < N12; i++) {
            System.out.println(m.get(i)); // Print elements from index N10 to N12-1
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` for dynamic array functionality and `Collections` for sorting and reversing.
2. **Initialization**: We declare and initialize the integer variables as in the Python code.
3. **ArrayList**: We use an `ArrayList<Integer>` to store the values, similar to the list in Python.
4. **Loop for popping and appending**: We use `remove()` to pop the first element and `add()` to append it to the end of the list.
5. **Sorting and Reversing**: We use `Collections.sort()` to sort the list and `Collections.reverse()` to reverse it.
6. **Printing**: We print the elements from index `N10` to `N12 - 1` using `get()` method of `ArrayList`. 

This Java code replicates the functionality of the original Python code.