Here is the provided Python function rewritten as a Java method:

```java
public class MultiplicationTable {
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 9; i++) {
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

    public static void main(String[] args) {
        printMultiplicationTable();
    }
}
```

In this Java method, the loop iterates from 1 to 9 (inclusive) to print the multiplication table for each number from 1 to 9.