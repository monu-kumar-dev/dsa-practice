package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 1, 2, 4, 9 };

        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}