// Ques: Print the given pattern
// n = 5
//     *     
//     *     
// * * * * * 
//     *     
//     *     


package patterns;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n(always odd num): ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter odd num");
            sc.close();
            return;
        }

        int mid = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (mid == i || mid == j) {
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
