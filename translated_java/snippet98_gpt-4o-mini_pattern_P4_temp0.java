Here's the equivalent Java code for the provided Python function:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {  // loop iteration
            for (int j = 1; j < 10; j++) {  // loop iteration
                System.out.print(i);  // print i
                System.out.print("x");  // print "x"
                System.out.print(j);  // print j
                System.out.print("=");  // print "="
                System.out.println(i * j);  // print the product
            }
        }
    }
}
```

### Explanation:
- The `main` method serves as the entry point of the Java program, similar to the `if __name__ == "__main__":` block in Python.
- The nested loops iterate from 1 to 9, just like in the Python version.
- `System.out.print` is used to print without a newline, while `System.out.println` is used to print with a newline at the end.