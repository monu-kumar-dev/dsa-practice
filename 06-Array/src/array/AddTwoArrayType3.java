package array;

import java.util.Vector;
import java.util.Collections;

public class AddTwoArrayType3 {
    public static void main(String[] args) {

        int[] arr1 = { 9, 5, 4, 9 };
        int[] arr2 = { 2, 1, 4 };

        System.out.println(addTwo(arr1, arr2)); // [9, 7, 6, 3]
    }

    public static Vector<Integer> addTwo(int[] arr1, int[] arr2) {

        Vector<Integer> result = new Vector<>();

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;

        // add while both arrays have digits
        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
                i--;
            }
            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            result.add(sum % 10);
            carry = sum / 10;
        }

        // if carry remains
        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }
}
