Certainly! Below is the equivalent Java code for the provided Python function:

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

### Breakdown of the Java Code:
- **Class Definition**: The function is placed inside a class named `Main`, which is standard in Java.
- **Main Method**: The entry point of the program is the `main` method.
- **Loops**: Two nested `for` loops iterate from 1 to 9, similar to Python's `range(1, 10)`.
- **Printing**: `System.out.print` is used for continuous printing on the same line, while `System.out.println` is used to move to the next line after printing the product.