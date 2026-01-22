// Two sum
// arr = {1, 5, 8 -3},  target = 2   output: 1 3

package array;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 8, -3};
        int target = 2;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.print(i + " " + j);
                    return;
                }
            }
        }
    }
}
