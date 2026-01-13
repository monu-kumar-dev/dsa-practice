package if_else;

import java.util.Scanner;

public class FourDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your num value: ");
        int num = sc.nextInt();

        if (num >= 1000 && num <= 9999) {
            System.out.println("It is a 4 digit number");
        } else {
            System.out.println("It is not a 4 digit number");
        }

        sc.close();
    }
}
