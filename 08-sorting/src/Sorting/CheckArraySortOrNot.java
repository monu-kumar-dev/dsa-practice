package Sorting;

public class CheckArraySortOrNot {
    public static void main(String[] args) {
        // int[] arr = { 1, 0, 2, 3, 4, 5, 6, 3 };
        // int[] arr = {-1, 0, 1, 2 };
        int[] arr = { 1, 1, 2, 3, 4, 4 };

        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Not Sorted");
                return;
            }
        }

        System.out.print("Sorted");
    }
}
