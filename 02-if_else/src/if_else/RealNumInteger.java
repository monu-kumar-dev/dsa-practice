package if_else;

import java.util.Scanner;

public class RealNumInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Num: ");
        double num = sc.nextDouble();

        // Type - 1

        // if (num == (int) num) {
        // System.out.println("Num is Integer");
        // } else {
        // System.out.println("Num is not Integer");
        // }

        // Type - 2

        int x = (int) num;
        if (num > x)
            System.out.println("Num is not Integer");
        else
            System.out.println("Num is Integer");

        sc.close();
    }
}
