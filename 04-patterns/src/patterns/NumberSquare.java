// Ques: Print the given pattern
// Enter n: 4
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4
package patterns;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
