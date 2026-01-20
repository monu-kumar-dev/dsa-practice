package array;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how much no. you want to mul: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter " + (i + 1) + " value: ");
            arr[i] = sc.nextInt();
        }

        int mul = 1;
        for (int i = 0; i < x; i++) {
            mul *= arr[i];
        }
        System.out.print("Total mul is: " + mul);
        sc.close();
    }
}
