// Ques: Print the given pattern

// Enter n: 5
// 1 
// A B
// 1 2 3
// A B C D
// 1 2 3 4 5

package patterns;

import java.util.Scanner;

public class AlphanumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
