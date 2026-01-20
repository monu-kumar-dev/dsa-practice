// Ques: Given an Array, print negative elements only

package array;

public class PrintNegative {
    public static void main(String[] args) {
        int arr[] = { 21, 32, -31, -34, 7, -54, 98 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
