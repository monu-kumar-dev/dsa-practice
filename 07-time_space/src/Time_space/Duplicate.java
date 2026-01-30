package Time_space;

import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 3 };
        System.out.println(findDuplicates(arr));
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result.add(arr[i]);
                }
            }
        }
        return result;
    }
}
