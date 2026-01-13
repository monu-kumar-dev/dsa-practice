package if_else;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd num: ");
        int c = sc.nextInt();

        // if (a <= b && a <= c) {
        // System.out.println("a is smallest");
        // } else if (b <= c && b <= a) {
        // System.out.println("b is smallest");
        // } else {
        // System.out.println("C is smallest");
        // }

        // With Nested If-Else
        // if (a <= b) {
        // if (a <= c) {
        // System.out.println("a is Smallest");
        // } else {
        // System.out.println("c is smallest");
        // }
        // } else {
        // if (b <= c) {
        // System.out.println("b is smallest");
        // } else {
        // System.out.println("c is smallest");
        // }
        // }

        // Terniary operator
        System.out.println((a <= b) ? ((a <= c) ? a : c) : ((b <= c) ? b : c));
        sc.close();
    }
}
