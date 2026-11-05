Here is the equivalent Java implementation of the provided Python snippet:

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

This Java code replicates the behavior of the original Python code by performing the same operations on the array and printing the same output.