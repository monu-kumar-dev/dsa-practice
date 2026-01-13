package if_else;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Num: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Num is even");
        } else {
            System.out.println("Num is odd");
        }
        sc.close();
    }
}