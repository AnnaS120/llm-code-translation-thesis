Certainly! The provided Python code uses list comprehension to generate multiplication table entries from 1 to 9. In Java, we can achieve similar functionality using nested loops. Here’s how you can translate that Python code into Java:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
- We use a class named `MultiplicationTable` as a container for our `main` method.
- Inside the `main` method, we create two nested `for` loops to iterate over the values from 1 to 9 for both `i` and `j`.
- We use `System.out.println` to print the formatted string, similar to Python's `print` function with `.format()`.