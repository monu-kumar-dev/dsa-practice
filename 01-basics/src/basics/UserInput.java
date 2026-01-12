package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // printing Area of circle
        System.out.print("Enter The Radius Of Circle: ");
        double r = sc.nextDouble();
        double pi = 22 / 7.0;
        double area = pi * r * r;
        System.out.println("Area is: ");
        System.out.print(area);
        sc.close(); // ✅ Scanner closed properly
    }
}
