// Subarray:--->

package Time_space;

public class Q19_Optimized {
    public static void main(String[] args) {

        int[] arr = { 10, 21, 32, 12, 16 };

        for (int i = 0; i < arr.length; i++) { // n times

            String subarray = "";

            for (int j = i; j < arr.length; j++) { // n times

                subarray += arr[j];
                System.out.print(subarray + "  ");
            }

            System.out.println();
        }
    }
}


// Time complexity:-->
// 0(n^2)

// Space complexity:-->
// 0(1)