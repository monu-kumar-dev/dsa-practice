package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(07);
        arr.add(17);
        arr.add(71);
        arr.add(54);

        System.out.println(arr.get(0)); // 25
        System.out.println(arr.get(2)); // 07

        // we want to change value, 07 -> 121

        arr.set(2, 121);
        System.out.println(arr.get(2)); // 121

        // If we want to print whole array then,
        System.out.println(arr); // [25, 21, 121, 17, 71, 54]

        // print using loop:-->
        // Note :--> array me .length hota tha but here .size()

        int n = arr.size();
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        // using for each loop:-->
        System.out.println();

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // 25, 21, 121, 17, 71, 54
        arr.add(78);
        System.out.println(arr); // [25, 21, 121, 17, 71, 54, 78]
        arr.add(1, 100);
        System.out.println(arr); // [25, 100, 21, 121, 17, 71, 54, 78]

        arr.remove(n - 1);
        System.out.println(arr); // [25, 100, 21, 121, 17, 54, 78]

        arr.remove(arr.size() - 1);
        System.out.println(arr); // [25, 100, 21, 121, 17, 54]

        // Reverse in arrayList:--->
        Collections.reverse(arr);
        System.out.println(arr); // [54, 17, 121, 21, 100, 25]
    }
}
