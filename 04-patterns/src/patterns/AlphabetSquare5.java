// Ques: Print the given pattern
// Enter n: 4
// a a a a
// A A A A
// b b b b
// B B B B
package patterns;

import java.util.Scanner;

public class AlphabetSquare5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        char lower = 'a';
        char upper = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print(lower + " ");
                } else {
                    System.out.print(upper + " ");
                }
            }
            if (i % 2 == 0) {
                lower++;
                upper++;
            }
            System.out.println();
        }
        sc.close();
    }
}
