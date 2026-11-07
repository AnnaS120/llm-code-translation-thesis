Certainly! Here is the equivalent Java implementation of the given Python snippet:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 1;
        for (int j = 0; j < 9; j++) {
            int b = 1;
            for (int i = 0; i < 9; i++) {
                System.out.println(a + "x" + b + "=" + (a * b));
                b++;
            }
            a++;
        }
    }
}
```

This Java program will produce the same output as the original Python snippet, generating a multiplication table from 1x1 to 9x9.