package array;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sortInWave(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortInWave(int arr[]) {
        // code here
        int n = arr.length;
        int i = 0;
        // int j = i + 1; // Note: Java me je assign samaye hi update hota hai, aur jb i
        // change ho raha hai phhir bhi ye 1 hi hai jo first time assign hua tha.

        while (i < n - 1) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i += 2;
        }
    }
}
