package function;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num a: ");
        int a = sc.nextInt();

        System.out.print("Enter num b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: " + a + " " + b);
        sc.close();
    }
}
