
// Ques: Print the given pattern
// Enter the num: 5
// * * * * * * * * * 
// * * * *   * * * * 
// * * *       * * *
// * *           * *
// *               *

package patterns;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        int nst = n - 1;
        int nsp = 1;

        for (int x = 1; x <= 2 * n - 1; x++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= nsp; k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= nst; l++) {
                System.out.print("* ");
            }
            nst--;
            nsp += 2;
            System.out.println();
        }
        sc.close();
    }
}
