Here is the Java equivalent of the given Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1;
        for (int k = 0; k < 9; k++) {
            int b = 1;
            for (int idx = 0; idx < 9; idx++) {
                System.out.println(a + "x" + b + "=" + (a*b));
                b++;
            }
            a++;
        }
    }
}
```

This Java program will output the same multiplication table as the given Python function.