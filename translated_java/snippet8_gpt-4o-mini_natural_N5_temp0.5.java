Here's the equivalent Java code that replicates the functionality of the provided Python code. This code uses appropriate data types and method structures in Java.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m, 36, 72, 97, 98, 95, 97, 2, 12, 90, 11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Remove the first element and get its value
            m.add(x); // Append it to the end of the list
        }

        Collections.sort(m); // Sort the list
        Collections.reverse(m); // Reverse the sorted list

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **Imports**: We import `ArrayList` and `Collections` to manage the list and perform sorting and reversing.
2. **ArrayList Initialization**: We create an `ArrayList<Integer>` to store the integers.
3. **Loop Structure**: We use a for loop to mimic the behavior of the Python code, removing the first element and appending it to the end.
4. **Sorting and Reversing**: We use `Collections.sort()` to sort the list and `Collections.reverse()` to reverse it.
5. **Printing**: Finally, we print the first three elements of the modified list. 

This code will compile and run successfully in a Java environment.