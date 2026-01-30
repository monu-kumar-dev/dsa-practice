// Ques : Given an array of size n+1 consisting of integers from 1 to n. One of the elements is duplicate in the array. Find that duplicate element.

package Time_space;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate_Optimized {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 3 };
        System.out.println(findDuplicates(arr));
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
