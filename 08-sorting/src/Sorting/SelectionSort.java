package Sorting;

public class SelectionSort {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 4, 1, 9, -3, 6, 5 };
        print(arr);
        // for (int i = 0; i < arr.length - 1; i++) {

        // int min = Integer.MAX_VALUE;
        // int minIndex = -1;
        // for (int j = i; j < arr.length; j++) {
        // if (arr[j] < min) {
        // min = arr[j];
        // minIndex = j;
        // }
        // }
        // //   
        // int temp = arr[i];
        // arr[i] = arr[minIndex];
        // arr[minIndex] = temp;
        // }
        // System.out.println();
        // print(arr);

        // Improve version:--->

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println();
        print(arr);
    }

}
