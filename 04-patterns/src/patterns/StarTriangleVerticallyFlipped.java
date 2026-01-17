// Ques: Print the given pattern
// Enter the num: 4
//       * 
//     * * 
//   * * * 
// * * * * 

package patterns;

import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        // // Type - 1

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if ((i + j) <= n - 2) {
        // System.out.print(" ");
        // } else {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }
        // sc.close();

        // Type - 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
