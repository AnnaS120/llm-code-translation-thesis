Here is the translated Java code for the given Python function:

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
        
        Collections.sort(height, Collections.reverseOrder());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```

This Java code creates an ArrayList `data` with the initial data values, then populates another ArrayList `height` with the first 10 values from `data`, sorts `height` in reverse order, and finally prints the top 3 values from the sorted list.