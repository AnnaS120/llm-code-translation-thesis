Here is the translated Java code equivalent to the given Python function:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 54, 57, 45, 93, 98, 80, 100, 58, 96};

        for (int i = 0; i < 10; i++) {
            int popped = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = popped;
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.println(arr[i]);
        }
    }
}
```

This Java code performs the same operations as the given Python function. It rotates the elements in the array, sorts it in descending order, and then prints the top 3 elements.