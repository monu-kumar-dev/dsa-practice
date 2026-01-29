// Given two arrays arr1 and arr2, representing two numbers such that every element of arrays represents a digit. The task is to find the sum of both the numbers.

// Examples:-->

// Input : arr1[] = [1, 2], arr2[] = [2, 1]
// Output : [3,3]

// Input : arr1[] = [9, 5, 4, 9], arr2[] = [2, 1, 4] 
// Output : [9,7,6,3]

package array;

import java.util.Vector;
import java.util.Collections;

public class AddTwoArrayType2 {
    public static void main(String[] args) {
        int[] arr1 = { 9, 9 };
        int[] arr2 = { 1 };

        // int[] arr3 = { 9, 5, 4, 9 };
        // int[] arr4 = { 2, 1, 4 };

        System.out.println(addTwo(arr1, arr2));

    }

    public static Vector<Integer> addTwo(int[] arr, int[] arr2) {
        Vector<Integer> result = new Vector<>();

        int n = arr.length - 1;
        int n2 = arr2.length - 1;

        int carry = 0;

        // jab tak dono arrays me elements hain
        while (n >= 0 && n2 >= 0) {
            int sum = arr[n] + arr2[n2] + carry;
            result.add(sum % 10);
            carry = sum / 10;
            n--;
            n2--;
        }

        // agar first array me elements bache hain
        while (n >= 0) {
            int sum = arr[n] + carry;
            result.add(sum % 10);
            carry = sum / 10;
            n--;
        }

        // agar second array me elements bache hain
        while (n2 >= 0) {
            int sum = arr2[n2] + carry;
            result.add(sum % 10);
            carry = sum / 10;
            n2--;
        }

        // agar last me carry bacha ho
        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }

}
