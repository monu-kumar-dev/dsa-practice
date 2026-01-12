package basics;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second num: ");
        int num2 = sc.nextInt();
        int add = num1 + num2;
        System.out.println("Addition is: " + add);
        sc.close();
    }
}
