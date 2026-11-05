Sure, here is the provided Python function rewritten as a Java method:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mt = {90, 99, 69, 5, 27, 13, 94, 88, 77, 77};

        for (int i = 0; i < 10; i++) {
            int popped = mt[0];
            for (int j = 0; j < mt.length - 1; j++) {
                mt[j] = mt[j + 1];
            }
            mt[mt.length - 1] = popped;
        }

        Arrays.sort(mt);
        System.out.println(mt[9]);
        System.out.println(mt[8]);
        System.out.println(mt[7]);
    }
}
```

In this Java method, we first create an array `mt` with the given values. Then, we loop through the array shifting elements to the left by one position in each iteration. After the loop, we sort the array using `Arrays.sort()` method and print the elements at indices 9, 8, and 7.