// Ques: Print the given pattern
// Number Spiral, n = 4
// 1 1 1 1 1 1 1
// 1 2 2 2 2 2 1
// 1 2 3 3 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 3 3 2 1
// 1 2 3 3 3 2 1
// 1 1 1 1 1 1 1

package patterns;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter positive number");
            sc.close();
            return;
        }

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                // int a = i;
                // int b = j;

                // if (i > n)
                // a = 2 * n - i;
                // if (j > n)
                // b = 2 * n - j;

                // Improvement of above code:->
                int row = (i > n) ? 2 * n - i : i;
                int col = (j > n) ? 2 * n - j : j;

                System.out.print(Math.min(row, col) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
