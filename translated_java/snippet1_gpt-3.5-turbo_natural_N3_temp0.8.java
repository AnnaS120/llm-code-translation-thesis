Sure, here is the Python function converted to a Java method:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(3, 54, 57, 45, 93, 98, 80, 100, 58, 96));

        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

In this Java method, we utilize an ArrayList to store the elements, and we use the Collections.sort() method with the reverseOrder() comparator to sort the list in descending order.