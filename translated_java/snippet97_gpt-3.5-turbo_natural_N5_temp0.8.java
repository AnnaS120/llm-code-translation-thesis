Here is the Java code equivalent of the given Python code:

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

This Java code follows the same logic as the original Python code and will compile successfully.