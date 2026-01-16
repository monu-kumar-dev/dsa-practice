// Ques: Print the given pattern
// Enter n: 4
// a a a a
// B B B B
// c c c c
// D D D D
package patterns;

import java.util.Scanner;

public class AlphabetSquare4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        char ch = 'A';
        char ch2 = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch + " ");
                } else {
                    System.out.print(ch2 + " ");

                }
            }
            ch++;
            ch2++;
            System.out.println();
        }
        sc.close();
    }
}
