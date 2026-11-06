Here is the equivalent Java function for the given Python code:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
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
}
``` 

In this Java code, the loop starts from `int i = 1` and goes up to `i < 10`, just like in the Python `range(1,10)` function. The `System.out.println` statements are used to print the multiplication table in a similar format to the Python `print` statements.