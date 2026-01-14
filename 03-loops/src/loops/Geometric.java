// Ques: Display this GP - 1,2,4,8.. upto ‘n’ terms
// n = 2 // 1, 2
// n = 3 // 1, 2, 4
// n = 6 // 1, 2, 4, 8, 16, 32
package loops;

import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        int term = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term *= 2;
        }

        sc.close();
    }
}
