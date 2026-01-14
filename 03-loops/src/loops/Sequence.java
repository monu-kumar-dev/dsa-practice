// HW: Take ‘n’ as input from user and print the following sequence..
// 1 n 2 n-1 3 n-2 ....
// n = 5 // 1 5 2 4 3 3 4 2 5 1

package loops;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print sequence: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            System.out.print((n - i + 1) + " ");
        }

        sc.close();
    }
}
