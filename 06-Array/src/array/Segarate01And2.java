package array;

public class Segarate01And2 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2 };
        sort012(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    public static void sort012(int[] arr) {
        // code here
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0 += 1;
            } else if (arr[i] == 1) {
                count1 += 1;
            }
        }

        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }

        for (int i = count0; i < count1 + count0; i++) {
            arr[i] = 1;
        }

        for (int i = count1 + count0; i < arr.length; i++) {
            arr[i] = 2;
        }
    }
}
