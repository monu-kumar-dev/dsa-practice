package if_else;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter a positive number");
        } else if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("Apurva");
        } else if (num % 5 == 0) {
            System.out.println("Riya");
        } else if (num % 3 == 0) {
            System.out.println("Banu");
        } else {
            System.out.println("Isha");
        }

        sc.close();
    }
}
