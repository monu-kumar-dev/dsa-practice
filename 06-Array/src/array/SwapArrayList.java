package array;

import java.util.ArrayList;

public class SwapArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        // System.out.println(arr); // [10, 20, 30, 40, 50]

        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        System.out.println(arr); // [50, 40, 30, 20, 10]
    }
}
