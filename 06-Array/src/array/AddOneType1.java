package array;

import java.util.Vector;

public class AddOneType1 {
    public static void main(String[] args) {
        // int[] arr = { 5, 7, 8, 7 };
        int[] arr2 = {9, 9, 9};

        System.out.println(addOne(arr2));
    }

    public static Vector<Integer> addOne(int[] arr) {
        int n = arr.length - 1;

        while (n >= 0 && arr[n] == 9) {
            arr[n] = 0;
            n--;
        }

        if (n >= 0) {
            arr[n] += 1;
        }

        Vector<Integer> result = new Vector<>();
        if (n < 0) {
            result.add(1);
        }

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
