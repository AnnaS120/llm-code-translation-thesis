Here is the Java equivalent of the given Python function:

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

In this Java code, we use an `ArrayList` to store the values and perform the equivalent operations as in the Python code. We add elements to the list, remove the first element, sort the list, and then print the elements at indices 9, 8, and 7.