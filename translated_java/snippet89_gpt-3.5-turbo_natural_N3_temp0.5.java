Here is the provided Python function rewritten as a Java method:

```java
public class MultiplicationTable {
    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "x1=" + i);
            System.out.println(i + "x2=" + i*2);
            System.out.println(i + "x3=" + i*3);
            System.out.println(i + "x4=" + i*4);
            System.out.println(i + "x5=" + i*5);
            System.out.println(i + "x6=" + i*6);
            System.out.println(i + "x7=" + i*7);
            System.out.println(i + "x8=" + i*8);
            System.out.println(i + "x9=" + i*9);
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable();
    }
}
```

In this Java method, the `printMultiplicationTable` method is called to print the multiplication table from 1 to 9 for each number from 1 to 9. The `main` method is used to call the `printMultiplicationTable` method when the class is executed.