// Ques: Take 3 positive integers input and print the greatest of them.

package if_else;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd num: ");
        int c = sc.nextInt();

        // if (a > b && a > c) {
        // System.out.println("a is greatest");
        // } else if (b > c && b > a) {
        // System.out.println("b is greatest");
        // } else {
        // System.out.println("C is greatest");
        // }

        // With Nested If-Else

        if (a >= b) {
            if (a >= c) {
                System.out.println("A is Greatest");
            } else {
                System.out.println("C is Greatest");
            }
        } else {
            if (b >= c) {
                System.out.println("B is Greatest");
            } else {
                System.out.println("C is Greatest");
            }
        }

        sc.close();
    }
}
