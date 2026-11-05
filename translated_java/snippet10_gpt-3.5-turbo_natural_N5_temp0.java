Here is the Java code equivalent to the given Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        mt.add(90);
        mt.add(99);
        mt.add(69);
        mt.add(5);
        mt.add(27);
        mt.add(13);
        mt.add(94);
        mt.add(88);
        mt.add(77);
        mt.add(77);

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

This Java code creates an ArrayList of integers, performs the same operations as the Python code, and then prints the 10th, 9th, and 8th elements of the sorted list.