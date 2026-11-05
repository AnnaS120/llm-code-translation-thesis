To translate the given Python code into Java, we need to keep in mind the differences between the two languages, particularly in terms of syntax, data structures, and libraries. Below is the Java equivalent of the provided Python function.

### Python Code:
```python
N1 = 100
N2 = 47
N3 = 95
N4 = 64
N5 = 50
N6 = 46
N7 = 92
N8 = 10
N9 = 84
N10 = 39
N11 = 0
N12 = 5
N13 = 3

list = [N9, N2, N6, N1, N7, N3, N10, N4, N5, N12]

for i in range(N11, N8):
    t = int(list.pop(N11))
    list.append(t)

list.sort(reverse=True)
for i in range(N11, N13):
    print(list[i])
```

### Java Code:
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 100;
        int N2 = 47;
        int N3 = 95;
        int N4 = 64;
        int N5 = 50;
        int N6 = 46;
        int N7 = 92;
        int N8 = 10;
        int N9 = 84;
        int N10 = 39;
        int N11 = 0;
        int N12 = 5;
        int N13 = 3;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(N9);
        list.add(N2);
        list.add(N6);
        list.add(N1);
        list.add(N7);
        list.add(N3);
        list.add(N10);
        list.add(N4);
        list.add(N5);
        list.add(N12);

        for (int i = N11; i < N8; i++) {
            // Remove value at index N11 and store it
            int t = list.remove(N11);
            // Append the removed value to the end of the list
            list.add(t);
        }

        // Sort the list in reverse order
        Collections.sort(list, Collections.reverseOrder());

        // Print the values from the list
        for (int i = N11; i < N13; i++) {
            System.out.println(list.get(i));
        }
    }
}
```

### Explanation:
1. **Variable Declarations**: The variables in Python are declared and initialized similarly in Java using `int`.
   
2. **ArrayList**: In Java, we use `ArrayList` instead of a simple list. We initialize it and add elements using `add()`.

3. **Looping**: The for loop syntax in Java is slightly different, with explicit type declarations.

4. **Removing and Adding Elements**: The methods `remove(int index)` and `add(int element)` in Java replace the `pop` and `append` methods from Python.

5. **Sorting**: We use `Collections.sort()` with a comparator to sort the list in reverse order.

6. **Printing**: The `System.out.println()` method is used to print elements in Java.

This Java code should function equivalently to the provided Python code.