package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 1, 2, 4, 9 };

        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // for (int p = 0; p < n; p++) {
        // System.out.print(arr[p] + " ");
        // }

        // using foreach loop

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}