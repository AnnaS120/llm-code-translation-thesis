Here is the equivalent Java method for the provided Python function:

```java
public void rearrangeAndPrint() {
    ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(34, 12, 51, 64, 82, 55, 31, 36, 66, 4));

    for (int i = 0; i < 10; i++) {
        ans.add(ans.remove(0));
    }

    Collections.sort(ans, Collections.reverseOrder());

    for (int i = 0; i < 3; i++) {
        System.out.println(ans.get(i));
    }
}
```

Make sure to import the necessary packages (`java.util.ArrayList`, `java.util.Arrays`, `java.util.Collections`) at the beginning of your Java file.