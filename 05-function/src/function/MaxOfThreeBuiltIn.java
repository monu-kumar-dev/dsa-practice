package function;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st num: ");
        double a = sc.nextDouble();

        System.out.print("enter 2nd num: ");
        double b = sc.nextDouble();

        System.out.print("enter 3rd num: ");
        double c = sc.nextDouble();

        // double max = Math.max(a, b);
        // double largest = Math.max(max, c);

        // short:->
        double largest = Math.max(a, Math.max(b, c));

        System.out.print("Largest num is: " + largest);

        sc.close();
    }
}
