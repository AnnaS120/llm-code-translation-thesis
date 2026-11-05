Here is the equivalent Java code for the given Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N1 = 95;
        int N2 = 87;
        int N3 = 99;
        int N4 = 55;
        int N5 = 14;
        int N6 = 51;
        int N7 = 69;
        int N8 = 37;
        int N9 = 20;
        int N10 = 3;
        
        Integer[] mountList = {N6, N1, N5, N7, N9, N3, N10, N8, N4, N2};
        Arrays.sort(mountList, (a, b) -> b.compareTo(a));

        for (int i = 0; i < N10; i++) {
            System.out.println(mountList[i]);
        }
    }
}
```

Make sure to import the necessary libraries and change the data types accordingly based on the requirements of your Java program.