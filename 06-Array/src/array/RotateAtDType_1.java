package array;

public class RotateAtDType_1 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int d = 2;

        int[] arr2 = new int[n];

        int j = 0;
        for (int i = d; i < n; i++) {
            arr2[j] = arr[i];
            j++;
        }

        for (int i = 0; i < d; i++) {
            arr2[j] = arr[i];
            j++;
        }

        j = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[j];
            j++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
