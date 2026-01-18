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

        System.out.print("enter 4th num: ");
        double d = sc.nextDouble();

        // double max = Math.max(a, b);
        // double largest = Math.max(max, c);

        // short:->
        double maxInThree = Math.max(a, Math.max(b, c));

        System.out.println("largest num in 3 is: " + maxInThree);

        // 4th num ka maximum:-->
        double maxInFour = Math.max(a, Math.max(b, Math.max(c, d)));
        System.out.println("Largest num in 4 is: " + maxInFour);
        sc.close();
    }
}
