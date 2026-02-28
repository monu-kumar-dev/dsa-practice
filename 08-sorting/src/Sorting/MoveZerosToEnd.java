package Sorting;

public class MoveZerosToEnd {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, -2, 3, 0, 4, 8, 0, 10, 12 };
        int n = arr.length;
        // Bubble Sort Style:---> TC = O(n^2)

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
            System.out.println();
            print(arr);
        }
    }
}
