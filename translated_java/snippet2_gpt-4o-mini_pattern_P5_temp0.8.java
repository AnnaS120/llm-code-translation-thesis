Here's how you can translate the given Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        Collections.addAll(h, 66, 13, 1, 72, 84, 93, 70, 37, 17, 98);
        int N = 10;

        for (int n = 0; n < N; n++) {
            h.add(h.remove(0)); // Remove the first element and add it to the end
        }

        Collections.sort(h, Collections.reverseOrder()); // Sort in descending order

        for (int i = 0; i < 3; i++) {
            System.out.println(h.get(i)); // Print the top 3 elements
        }
    }
}
```

### Explanation:
1. **ArrayList**: We use `ArrayList` to mimic the dynamic list behavior of Python.
2. **Collections.addAll**: This method adds multiple elements to the `ArrayList`.
3. **h.remove(0)**: This removes the first element from the list and returns it, similar to `h.pop(0)` in Python.
4. **Collections.sort**: This sorts the list in descending order using `Collections.reverseOrder()`.
5. **System.out.println**: This is used to print the top three elements. 

You can compile and run this Java program to achieve the same functionality as the original Python code.