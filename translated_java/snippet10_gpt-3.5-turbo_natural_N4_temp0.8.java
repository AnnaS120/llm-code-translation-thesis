Sure, here is the equivalent Java implementation of the given Python snippet:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mt = {90, 99, 69, 5, 27, 13, 94, 88, 77, 77};

        for (int i = 0; i < 10; i++) {
            int firstElement = mt[0];
            for (int j = 0; j < mt.length - 1; j++) {
                mt[j] = mt[j + 1];
            }
            mt[mt.length - 1] = firstElement;
        }

        Arrays.sort(mt);
        System.out.println(mt[9]);
        System.out.println(mt[8]);
        System.out.println(mt[7]);
    }
}
```

This Java code performs the same operations as the original Python snippet, moving the elements in the array and then sorting it to print the 10th, 9th and 8th elements.