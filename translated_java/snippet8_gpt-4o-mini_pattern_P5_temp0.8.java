Here is the translation of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> m = new ArrayList<>();
        m.add(36);
        m.add(72);
        m.add(97);
        m.add(98);
        m.add(95);
        m.add(97);
        m.add(2);
        m.add(12);
        m.add(90);
        m.add(11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0);  // remove the first element and store it in x
            m.add(x);             // append x to the end of the list
        }

        Collections.sort(m);        // sort the list
        Collections.reverse(m);     // reverse the list

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i));  // print the first three elements
        }
    }
}
```

### Explanation:

1. **List Initialization**: We use an `ArrayList` to replicate the list behavior in Python.
2. **Loop for Pop and Append**: The loop iterates 10 times, removing the first element (`m.remove(0)`) and adding it to the end of the list (`m.add(x)`).
3. **Sorting and Reversing**: The `Collections.sort()` method sorts the list, and `Collections.reverse()` reverses it.
4. **Printing the First Three Elements**: Finally, we print the first three elements of the list after sorting and reversing.

Make sure to import the necessary classes from the `java.util` package for handling lists and collections.