Here’s the equivalent Java code for the provided Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        Collections.addAll(mt, 90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0));
        }

        Collections.sort(mt);
        System.out.println(mt.get(9));
        System.out.println(mt.get(8));
        System.out.println(mt.get(7));
    }
}
```

### Explanation:
1. **ArrayList Initialization**: In Java, we use `ArrayList` to hold the integers, similar to a list in Python.
2. **Adding Elements**: We use `Collections.addAll` to initialize the `ArrayList` with values.
3. **Loop**: The `for` loop iterates 10 times, where we remove the first element (index 0) using `remove(0)` and then add it to the end of the list with `add()`.
4. **Sorting**: After the loop, we sort the list using `Collections.sort()`.
5. **Accessing Elements**: Finally, we retrieve and print the 10th, 9th, and 8th largest values using `get()`.

Make sure to include the necessary imports when using this code in a Java environment.