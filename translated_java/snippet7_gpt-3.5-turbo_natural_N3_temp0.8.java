```java
import java.util.ArrayList;
import java.util.Collections;

public class MountList {
    public static void main(String[] args) {
        ArrayList<Integer> mountList = new ArrayList<>();
        Collections.addAll(mountList, 51, 95, 14, 69, 20, 99, 3, 37, 55, 87);
        Collections.sort(mountList, Collections.reverseOrder());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(mountList.get(i));
        }
    }
}
```