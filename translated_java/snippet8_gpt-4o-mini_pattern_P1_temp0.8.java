Sure! Here’s how you can translate the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        m.add(36);
        m.add(72);
        m.add(97);
        m.add(98);
        m.add(95);
        m.add(97);
        m.add(2);
        m.add(12);
        m.add(90);
        m.add(11);

        for (int i = 0; i < 10; i++) {
            int x = m.remove(0); // Remove the first element and get its value
            m.add(x); // Append it to the end of the list
        }

        Collections.sort(m); // Sort the list
        Collections.reverse(m); // Reverse the list

        for (int i = 0; i < 3; i++) {
            System.out.println(m.get(i)); // Print the first three elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList<Integer>` to hold the integers, as it provides dynamic array functionalities.
2. **Removing and Adding Elements**: The `remove(0)` method removes the first element and returns it, while `add(x)` appends it to the end of the list.
3. **Sorting and Reversing**: We use `Collections.sort()` to sort the list and `Collections.reverse()` to reverse the sorted list.
4. **Printing Elements**: We loop through the first three indices of the list to print the required elements. 

Feel free to run the Java code in any Java environment!