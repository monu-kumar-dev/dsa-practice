// Ques: Print the second Maximum element in the array

package array;

public class SecondMaxOneLoop {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 4, 9, 12 };
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {

        int max = arr[0];
        int sMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] > sMax && arr[i] < max) {
                sMax = arr[i];
            }
        }

        // if no second largest exists
        if (sMax == Integer.MIN_VALUE) {
            return -1;
        }

        return sMax;
    }
}