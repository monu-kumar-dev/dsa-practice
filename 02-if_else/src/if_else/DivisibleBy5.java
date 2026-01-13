package if_else;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Num: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Num is divisible");
        } else {
            System.out.println("Num is not divisible");
        }
        sc.close();
    }
}
