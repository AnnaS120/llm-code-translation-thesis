Certainly! Here’s the equivalent Java code for the provided Python function:

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        // Generate multiplication table from 1 to 9
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
```

### Explanation:
- The outer loop iterates through numbers from 1 to 9 (`i`).
- The inner loop also iterates through numbers from 1 to 9 (`j`).
- The multiplication result of `i` and `j` is printed in the format `ixj=result`.
- The `main` method is the entry point of the Java program, similar to the `if __name__ == '__main__':` in Python.