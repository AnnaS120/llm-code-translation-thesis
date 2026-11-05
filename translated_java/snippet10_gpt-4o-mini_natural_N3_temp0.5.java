Here’s how you can rewrite the provided Python function as a Java method, following proper Java syntax and conventions:

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
1. **Imports**: We import `ArrayList` and `Collections` for list manipulation and sorting.
2. **ArrayList Initialization**: We create an `ArrayList<Integer>` and add the initial values using `Collections.addAll()`.
3. **Loop**: We use a for loop to shift the elements, similar to the Python version.
4. **Sorting**: We use `Collections.sort()` to sort the list.
5. **Printing**: We use `System.out.println()` to print the top three values after sorting. 

Make sure you run this Java code in an environment that supports Java, such as an IDE or a command-line setup with the Java Development Kit (JDK) installed.