package array;

public class MergeTwoWIthExtraArrayOpposite {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 6, 9 };
        int[] arr2 = { 1, 3, 4, 5, 7, 8 };

        int ans[] = merge(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] merge(int arr1[], int arr2[]) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = arr1.length - 1, j = arr2.length - 1, k = arr3.length - 1;

        // jab tak dono arrays me elements hain
        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                arr3[k--] = arr1[i--];
            } else {
                arr3[k--] = arr2[j--];
            }
        }

        // agar arr1 me elements bache hain
        while (i >= 0) {
            arr3[k--] = arr1[i--];
        }

        // agar arr2 me elements bache hain
        while (j >= 0) {
            arr3[k--] = arr2[j--];
        }

        return arr3;
    }

}
