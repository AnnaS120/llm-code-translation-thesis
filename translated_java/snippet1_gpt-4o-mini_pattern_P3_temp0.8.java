Here's the translated version of the provided Python function into Java:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int N1 = 100;
        int N2 = 80;
        int N3 = 96;
        int N4 = 93;
        int N5 = 58;
        int N6 = 10;
        int N7 = 45;
        int N8 = 98;
        int N9 = 57;
        int N10 = 54;
        int N11 = 0;
        int N12 = 3;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(N12);
        arr.add(N10);
        arr.add(N9);
        arr.add(N7);
        arr.add(N4);
        arr.add(N8);
        arr.add(N2);
        arr.add(N1);
        arr.add(N5);
        arr.add(N3);

        for (int i = 0; i < N6; i++) {
            arr.add(arr.remove(N11));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N12; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

### Explanation:
1. **ArrayList**: In Java, we use `ArrayList` to create a dynamic array similar to Python's list.
2. **Adding Elements**: We add elements to the `ArrayList` using the `add()` method.
3. **Removing and Adding Elements**: The `remove(int index)` method removes the element at the specified index and returns it. We then add that element back to the end of the list.
4. **Sorting**: We use `Collections.sort()` with `Collections.reverseOrder()` to sort the list in descending order.
5. **Printing Elements**: Finally, we print the specified number of top elements from the sorted list.