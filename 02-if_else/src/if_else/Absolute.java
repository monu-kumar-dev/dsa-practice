// 5 = 5, -4 = 4, -3 = 3, 6 = 6

package if_else;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Num: ");
        int num = sc.nextInt();

        // if (num < 0) {
        // System.out.println(num * -1);
        // } else {
        // System.out.println(num);
        // }

        // in short:--->
        System.out.println(Math.abs(num));
        sc.close();
    }
}
