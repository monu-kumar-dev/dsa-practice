
// Ques: Print the given pattern
// n = 5
// *       * 
//   *   *   
//     *     
//   *   *   
// *       * 
  

package patterns;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n(always odd num): ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter odd num");
            sc.close();
            return;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
