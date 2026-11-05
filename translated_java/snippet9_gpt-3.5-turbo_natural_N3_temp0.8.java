```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] data = {74, 43, 60, 53, 24, 35, 63, 32, 7, 71};
        ArrayList<Integer> height = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            height.add(data[i]);
        }
        
        Collections.sort(height, Collections.reverseOrder());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(height.get(i));
        }
    }
}
```