package array;

public class MergeTwoInPlace {
    public static void main(String[] args) {

        int[] arr1 = {2, 5, 6, 9, 0, 0, 0, 0, 0, 0};
        int[] arr2 = {1, 3, 4, 5, 7, 8};

        int m = 4; // valid elements in arr1
        int n = arr2.length;

        mergeInPlace(arr1, m, arr2, n);

        for (int x : arr1) {
            System.out.print(x + " ");
        }
    }

    public static void mergeInPlace(int[] arr1, int m, int[] arr2, int n) {

        int i = m - 1;        // last valid index of arr1
        int j = n - 1;        // last index of arr2
        int k = m + n - 1;    // last index of arr1 (total size)

        // merge from right to left
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // agar arr2 ke elements bache ho
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }
}
