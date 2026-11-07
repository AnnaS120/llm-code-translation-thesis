Here is the Java equivalent of the provided Python code, using appropriate data types and method structure:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i);
                System.out.print("x");
                System.out.print(j);
                System.out.print("=");
                System.out.println(i*j);
            }
        }
    }
}
```

You can save this code in a file named `MultiplicationTable.java` and compile it using a Java compiler.