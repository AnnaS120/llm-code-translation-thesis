Here is the Java equivalent of the given Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mountList = new ArrayList<>();
        mountList.add(51);
        mountList.add(95);
        mountList.add(14);
        mountList.add(69);
        mountList.add(20);
        mountList.add(99);
        mountList.add(3);
        mountList.add(37);
        mountList.add(55);
        mountList.add(87);

        Collections.sort(mountList, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```

This Java code will create an ArrayList, populate it with the same values as the Python list, sort it in descending order, and then print the first three elements of the sorted list.