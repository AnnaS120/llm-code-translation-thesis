Here is the equivalent Java code for the given Python function:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(54);
        arr.add(57);
        arr.add(45);
        arr.add(93);
        arr.add(98);
        arr.add(80);
        arr.add(100);
        arr.add(58);
        arr.add(96);

        for (int i = 0; i < 10; i++) {
            arr.add(arr.remove(0));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
```

In this Java code:
- We use an `ArrayList` to store the integers.
- We loop through the initial array and perform the equivalent operations of the Python code.
- We use `Collections.sort` with `Collections.reverseOrder()` to sort the ArrayList in descending order.
- Finally, we loop through the first 3 elements of the sorted array and print them.