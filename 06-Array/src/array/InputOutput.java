package array;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] arr = { 5, -7, 45, 32, -87 };
        // System.out.println("Length of arr: " + arr.length);
        // // System.out.println(arr[0]);
        // // System.out.println(arr[1]);
        // // System.out.println(arr[2]);
        // // System.out.println(arr[3]);
        // // System.out.println(arr[4]);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // Type - 2
        int[] arr = new int[7];
        // default values
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " "); // 0 0 0 0 0 0 0
        }
        System.out.println();

        // input
        int[] arr2 = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter " + (i + 1) + "st value: ");
            arr2[i] = sc.nextInt();
        }
        // print
        for (int i = 0; i < 7; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
