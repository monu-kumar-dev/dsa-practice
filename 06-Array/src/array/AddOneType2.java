package array;

import java.util.Vector;
import java.util.Collections;

public class AddOneType2 {
    public static void main(String[] args) {
        // int[] arr = { 5, 7, 8, 7 };
        int[] arr2 = { 9, 9, 9 };

        System.out.println(addOne(arr2));
    }

    public static Vector<Integer> addOne(int[] arr) {
        int n = arr.length - 1;
        Vector<Integer> result = new Vector<>();
        int carry = 1;
        // for (int i = n; i >= 0; i--) {
        //     if (arr[i] + carry <= 9) {
        //         result.add(arr[i] + carry);
        //         carry = 0;
        //     } else {
        //         result.add(0);
        //         carry = 1;
        //     }
        // }

        // +++++++++++ OR +++++++++++++

        for (int i = n; i >= 0; i--) {
            int sum = arr[i] + carry;
            result.add(sum % 10);   // digit
            carry = sum / 10;       // carry
        }
        // if carry still left (like 999)
        if (carry == 1) {
            result.add(1);
        }

        Collections.reverse(result);
        return result;
    }
}
