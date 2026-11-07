Sure, here is the Python function rewritten as a Java method:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

In Java, we use a nested loop to iterate over the values of `i` and `j`, and then print out the multiplication table in the desired format.