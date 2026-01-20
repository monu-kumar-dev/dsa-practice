// Ques: Print the Maximum element in the array

package array;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = { -12, 32, -43, 76, 87 };

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max is: " + max);
    }
}
