Here is the translation of the given Python code into Java:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N1 = 64;
        int N2 = 55;
        int N3 = 31;
        int N4 = 34;
        int N5 = 51;
        int N6 = 36;
        int N7 = 10;
        int N8 = 12;
        int N9 = 66;
        int N10 = 82;
        int N11 = 0;
        int N12 = 4;
        int N13 = 3;

        int[] ans = {N4, N8, N5, N1, N10, N2, N3, N6, N9, N12};
        
        for (int i = N11; i < N7; i++) {
            int popped = ans[N11];
            for (int j = N11; j < ans.length - 1; j++) {
                ans[j] = ans[j+1];
            }
            ans[ans.length - 1] = popped;
        }
        
        Arrays.sort(ans);
        
        for (int i = N11; i < N13; i++) {
            System.out.println(ans[i]);
        }
    }
}
```

Please note that the Java code provided above closely mirrors the logic of the Python code given.