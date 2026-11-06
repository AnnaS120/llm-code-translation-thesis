Here is the equivalent Java code for the given Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for(int j = 1; j < 10; j++) {
            for(int i = 1; i < 10; i++) {
                System.out.println(j + "x" + i + "=" + (i*j));
            }
        }
    }
}
```