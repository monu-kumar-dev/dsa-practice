// Ques: Print the given pattern
// Enter n: 4
// A A A A 
// B B B B 
// C C C C 
// D D D D
package patterns;

import java.util.Scanner;

public class AlphabetSquare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
        sc.close();
    }
}
