package array;

public class MergeTwoWithExtraArray {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 6, 9 };
        int[] arr2 = { 1, 3, 4, 5, 7, 8 };

        int ans[] = merge(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] merge(int arr1[], int arr2[]) {

        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        // jab tak dono arrays me elements hain
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // agar arr1 me elements bache hain
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        // agar arr2 me elements bache hain
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }

}
