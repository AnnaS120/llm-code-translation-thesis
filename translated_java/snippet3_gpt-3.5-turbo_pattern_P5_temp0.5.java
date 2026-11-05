Here is the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
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

This Java code performs the same operations as the given Python function and produces the same output.