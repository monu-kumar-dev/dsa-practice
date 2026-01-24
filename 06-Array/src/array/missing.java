package array;

public class missing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int num = missingNum(arr);
        System.out.print("Missing num is: " + num);
    }

    public static int missingNum(int arr[]) {

        int n = arr.length + 1;

        long totalSum = (long) n * (n + 1) / 2;

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (int) (totalSum - sum);
    }
}
