Here is the Java equivalent of the given Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "x1=" + i);
            System.out.println(i + "x2=" + i * 2);
            System.out.println(i + "x3=" + i * 3);
            System.out.println(i + "x4=" + i * 4);
            System.out.println(i + "x5=" + i * 5);
            System.out.println(i + "x6=" + i * 6);
            System.out.println(i + "x7=" + i * 7);
            System.out.println(i + "x8=" + i * 8);
            System.out.println(i + "x9=" + i * 9);
        }
    }
}
```

This Java code snippet replicates the Python function by printing the multiplication table from 1x1 to 9x9.