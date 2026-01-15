// Ques: Factorial of a number
// 5! = 5 * 4 * 3 * 2 * 1 = 120

package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial not defined");
            sc.close();
            return;
        }

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.print("Factorial is: " + fact);
        sc.close();
    }
}
