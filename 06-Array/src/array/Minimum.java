// Ques: Print the Minimum element in the array

package array;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = { -12, 32, -43, 76, 87, -122 };

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min is: " + min);
    }
}
