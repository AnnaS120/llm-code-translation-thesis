Here is the equivalent Java code for the given Python function:

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 1;

        for (int i = N2; i < N1; i++) {
            for (int j = N2; j < N1; j++) {
                System.out.printf("%dx%d=%d\n", i, j, i * j);
            }
        }
    }
}
```

This Java code performs the same nested loop logic as the original Python function and prints the multiplication table for numbers ranging from 1 to 10.