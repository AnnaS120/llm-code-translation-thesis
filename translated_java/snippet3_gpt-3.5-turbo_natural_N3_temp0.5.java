Here is the provided Python function rewritten as a Java method:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(34);
        ans.add(12);
        ans.add(51);
        ans.add(64);
        ans.add(82);
        ans.add(55);
        ans.add(31);
        ans.add(36);
        ans.add(66);
        ans.add(4);

        for (int i = 0; i < 10; i++) {
            ans.add(ans.remove(0));
        }

        Collections.sort(ans, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```

In this Java version, we use an ArrayList to store the numbers and perform the required operations on it. The Collections class is used to sort the list in reverse order.