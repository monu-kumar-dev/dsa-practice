package array;

public class SubarraySumBruteforce {

    public static int[] subarraySum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                // if sum equals target, return 1-based indices
                if (sum == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }

        // if no subarray found
        return new int[] { -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int target = 12;

        int[] result = subarraySum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
