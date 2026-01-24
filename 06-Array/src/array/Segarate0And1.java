package array;

public class Segarate0And1 {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 0 };
        segregate0and1(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void segregate0and1(int[] arr) {
        // code here
        int countOf0 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countOf0 += 1;
            }

        }

        for (int i = 0; i < countOf0; i++) {
            arr[i] = 0;
        }

        for (int i = countOf0; i < arr.length; i++) {
            arr[i] = 1;
        }

    }
}
