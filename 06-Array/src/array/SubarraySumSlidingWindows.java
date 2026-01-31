package array;

public class SubarraySumSlidingWindows {

    public static int[] subarraySum(int[] arr, int target) {
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // shrink window if sum becomes greater than target
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            // if sum equals target, return 1-based indices
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
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
