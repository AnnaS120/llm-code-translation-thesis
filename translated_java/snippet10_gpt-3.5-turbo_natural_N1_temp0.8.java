Here is the Java equivalent of the given Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mt = {90, 99, 69, 5, 27, 13, 94, 88, 77, 77};

        for (int i = 0; i < 10; i++) {
            int removed = mt[0];
            for (int j = 1; j < mt.length; j++) {
                mt[j - 1] = mt[j];
            }
            mt[mt.length - 1] = removed;
        }

        Arrays.sort(mt);
        System.out.println(mt[9]);
        System.out.println(mt[8]);
        System.out.println(mt[7]);
    }
}
```

This Java code performs the same operations as the original Python code, including rotating the array elements and printing the values at specific indices after sorting.