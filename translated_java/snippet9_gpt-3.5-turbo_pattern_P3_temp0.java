Here is the equivalent Java code for the given Python function:

```java
public class Main {
    public static void main(String[] args) {
        int N1 = 71;
        int N2 = 43;
        int N3 = 63;
        int N4 = 60;
        int N5 = 35;
        int N6 = 10;
        int N7 = 24;
        int N8 = 74;
        int N9 = 32;
        int N10 = 53;
        int N11 = 0;
        int N12 = 7;
        int N13 = 3;

        int[] data = {N8, N2, N4, N10, N7, N5, N3, N9, N12, N1};
        int[] height = new int[N6];
        for (int i = 0; i < N6; i++) {
            height[i] = data[N11];
            data[N11] = 0;
        }

        int[] sort = height.clone();
        Arrays.sort(sort);
        for (int i = 0; i < N13; i++) {
            System.out.println(sort[N13 - 1 - i]);
        }
    }
}
```

Make sure to import the `java.util.Arrays` package at the beginning of your Java file.