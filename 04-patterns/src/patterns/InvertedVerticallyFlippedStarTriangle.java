// Ques: Print the given pattern
// Enter the num: 5
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 

package patterns;

import java.util.Scanner;

public class InvertedVerticallyFlippedStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
