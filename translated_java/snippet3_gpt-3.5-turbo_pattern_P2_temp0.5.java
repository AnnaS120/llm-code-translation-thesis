Here is the equivalent Java code for the given Python function:

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

        for (int idx = 0; idx < 10; idx++) {
            ans.add(ans.remove(0));
        }

        Collections.sort(ans, Collections.reverseOrder());

        for (int idx = 0; idx < 3; idx++) {
            System.out.println(ans.get(idx));
        }
    }
}
```