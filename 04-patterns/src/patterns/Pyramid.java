// Ques: Print the given pattern
// Enter the num: 4
//       * 
//     * * * 
//   * * * * *
// * * * * * * *

// 🥇 Verdict
// DSA + Interview → Type-2 ✅

package patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        // Type - 1

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= 2 * i - 1; k++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // sc.close();

        // Type - 2
        int nsp = n - 1;
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        sc.close();
    }
}
