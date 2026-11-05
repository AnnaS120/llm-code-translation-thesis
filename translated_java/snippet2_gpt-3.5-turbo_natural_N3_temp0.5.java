Here is the provided Python function rewritten as a Java method:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] h = {66, 13, 1, 72, 84, 93, 70, 37, 17, 98};
        int N = 10;

        for (int n = 0; n < N; n++) {
            Collections.rotate(Arrays.asList(h), 1);
        }

        Arrays.sort(h, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(h[i]);
        }
    }
}
```

In this Java version, we use `java.util.Arrays` and `java.util.Collections` to manipulate the array and perform the required operations. The `Collections.rotate` method is used to rotate the elements of the array, and `Arrays.sort` is used to sort the array in reverse order. Finally, the first three elements of the sorted array are printed to the console.