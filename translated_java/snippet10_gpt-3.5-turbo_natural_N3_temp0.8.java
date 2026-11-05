Here is the equivalent Java method for the provided Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mt = {90, 99, 69, 5, 27, 13, 94, 88, 77, 77};

        for (int i = 0; i < 10; i++) {
            int removed = mt[0];
            for (int j = 0; j < mt.length - 1; j++) {
                mt[j] = mt[j + 1];
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

In this Java equivalent code, the elements of the array are shifted to the left in each iteration to simulate the effect of `pop(0)` in Python. The `Arrays.sort()` method is used to sort the array in ascending order. The final print statements display the values at the 10th, 9th, and 8th indices of the sorted array.