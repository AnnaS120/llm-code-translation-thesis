To convert the provided Python code into Java, we need to consider Java's syntax, data types, and method structure. The equivalent Java code would look something like this:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mt = new ArrayList<>();
        
        // Initializing the ArrayList with the given values
        mt.add(90);
        mt.add(99);
        mt.add(69);
        mt.add(5);
        mt.add(27);
        mt.add(13);
        mt.add(94);
        mt.add(88);
        mt.add(77);
        mt.add(77);

        // Performing the rotation operation 10 times
        for (int i = 0; i < 10; i++) {
            mt.add(mt.remove(0)); // Remove the first element and add it to the end
        }

        // Sorting the ArrayList
        Collections.sort(mt);

        // Printing the top 3 elements
        System.out.println(mt.get(9)); // 1st largest element
        System.out.println(mt.get(8)); // 2nd largest element
        System.out.println(mt.get(7)); // 3rd largest element
    }
}
```

### Explanation:
1. **ArrayList:** In Java, we use `ArrayList<Integer>` instead of a list, as it provides dynamic array features similar to Python lists.
2. **Adding Elements:** We populate the `ArrayList` using the `add()` method.
3. **Removing and Adding:** The `remove(0)` method is used to remove the first element, and we use `add()` to append it back to the end of the list.
4. **Sorting:** We use `Collections.sort()` to sort the list.
5. **Printing Elements:** We access elements using `get(index)` to print the top three largest values.

This code will compile and run successfully in a Java environment.