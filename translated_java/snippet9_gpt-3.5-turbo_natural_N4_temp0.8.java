Sure! Here is the Java equivalent implementation of the provided Python snippet:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(74);
        data.add(43);
        data.add(60);
        data.add(53);
        data.add(24);
        data.add(35);
        data.add(63);
        data.add(32);
        data.add(7);
        data.add(71);

        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            height.add(data.remove(0));
        }

        ArrayList<Integer> sort = new ArrayList<>(height);
        Collections.sort(sort, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(sort.get(i));
        }
    }
}
``` 

This Java code snippet has the same functionality as the provided Python snippet. It creates an ArrayList `data` with the initial data, then extracts the first 10 elements into the `height` ArrayList, sorts it in descending order, and finally prints the top 3 values.