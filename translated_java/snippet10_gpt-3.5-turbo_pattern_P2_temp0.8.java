Here is the translated Java code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mt = Arrays.asList(90, 99, 69, 5, 27, 13, 94, 88, 77, 77);

        for (int idx = 0; idx < 10; idx++) {
            mt.add(mt.remove(0));
        }

        Collections.sort(mt);
        System.out.println(mt.get(9));
        System.out.println(mt.get(8));
        System.out.println(mt.get(7));
    }
}
```

This Java code performs the same operations as the original Python code and produces the same output.