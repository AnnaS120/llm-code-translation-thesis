Here is the Java code equivalent to the given Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>(List.of(90, 99, 69, 5, 27, 13, 94, 88, 77, 77));

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

In this Java code:
- We use an ArrayList to store the integers.
- We use the `add` and `remove` methods to simulate the behavior of `append` and `pop` in Python.
- We use `Collections.sort` to sort the ArrayList.
- We use `get` method to access elements at specific indices.
- We print the elements at indices 9, 8, and 7 as in the original Python code.