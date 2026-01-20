package array;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how much no. you want to add: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter " + (i + 1) + " value: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }
        System.out.print("Total sum is: " + sum);
        sc.close();
    }
}
