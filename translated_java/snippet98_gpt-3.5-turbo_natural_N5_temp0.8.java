Sure, here is the Java code equivalent to the given Python code:

```java
public class Main {
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

In this Java code:
- The `main` method is the entry point, similar to Python's `if __name__ == "__main__":`.
- The loops are implemented using `for` loops with appropriate data types (`int`).
- Printing to the console is performed using `System.out.print` for inline printing and `System.out.println` for printing with a newline.