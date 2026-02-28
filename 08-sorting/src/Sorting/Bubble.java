package Sorting;

public class Bubble {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, -2, 6, 7, 2, 0, 7, 2 };
        int n = arr.length;
        print(arr);

        // Bubble sort
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // System.out.println();
        // print(arr);
        // }

        // Bubble sort optimized:----------->

        // for (int i = 0; i < n - 1; i++) {
        // boolean swapped = false;

        // for (int j = 0; j < n - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // swapped = true;
        // }
        // }

        // if (!swapped) {
        // break;
        // }
        // System.out.println();
        // print(arr);
        // }

        // ✅ Optimized Code (More Efficient Bubble Sort)
        while (n > 0) {
            int lastSwappedIndex = 0;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    lastSwappedIndex = i + 1;
                }
            }

            n = lastSwappedIndex;
        }
        System.out.println();
        print(arr);
    }
}
